class Solution {
    public int[] replaceElements(int[] arr) {
        
        int l = arr.length - 1;
        int maxValue = -1;
        
        for (int i = l; i >= 0; i--){
            
            if (i == l){
                maxValue = arr[l];
                arr[l] = -1;
            } else {
                if(arr[i] > maxValue){
                    int current = arr[i];
                    arr[i] = maxValue;
                    maxValue = current;
                } else {
                    arr[i] = maxValue;
                }
            }
            
        
        }
        
        return arr;
    }
}