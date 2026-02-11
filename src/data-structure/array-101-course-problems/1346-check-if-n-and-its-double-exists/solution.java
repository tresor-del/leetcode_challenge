import java.util.Hashtable;
class Solution {
    
    // Complexity: O(N)
    
    public boolean checkIfExist(int[] arr) {
        
        // Check for edge cases
        if(arr == null || arr.length == 0){
            return false;
        }
        
        int length = arr.length;
        Hashtable<Integer, Boolean> arr2 = new Hashtable<>();
        
        for (int i = 0; i < length; i++){
            
            if ((arr[i] % 2 == 0 && arr2.containsKey(arr[i] / 2)) || arr2.containsKey(2 * arr[i])){
                return true;
                
            } else {
                arr2.put(arr[i], true);
            }
        }
        
        // if the element were not found
        return false;
    }

    // Complexity: O(N²)
    public boolean checkIfExist2(int[] arr){
        
        // Check for edge cases
        if(arr == null || arr.length == 0){
            return false;
        }
        
        int length = arr.length;
        int[] arr2 = new int[length];
        int arr2Length = 0;
        
        for (int i = 0; i < length; i++){

            arr2[i] = arr[arr2Length++];

            for (int j = 0; j < arr2Length; j++){
                if((arr[i] % 2 == 0 && arr[i] == arr2[j] / 2) || arr[i] == 2 * arr2[j]){
                    return true;
                }
            }
            
        }
        
        // if the element were not found
        return false;

    }
}