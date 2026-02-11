class Solution {
    public boolean validMountainArray(int[] arr) {
        
        int i = 0;
        int l = arr.length;
        
        // Check if the length is sufficient to form a mountain
        if (arr.length < 3){
            return false;
        }
        
        // Climb out: iterate through the rising slope
        while(i + 1 < l && arr[i] < arr[i+1]){
            i++;
        }
        
        // Peak Check: ensure the peak is not at the start or at the end
        if (i == 0 || i == l - 1){
            return false;
        }
        
        // Climb down: iterate through the falling slope
        while(i + 1 < l && arr[i] > arr[i+1]){
            i++;
        }
        
        return i == l - 1;
        
    }
}