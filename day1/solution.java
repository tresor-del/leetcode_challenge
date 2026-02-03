class Solution {
    
    public void duplicateZeros(int[] arr) {
        
        int length = arr.length - 1;
        int duplicateZeros = 0;
        
        for (int i = 0; i <= length - duplicateZeros; i ++) {
             
            if (arr[i] == 0){
                
                if (i == length - duplicateZeros){
                    arr[length] = 0;
                    length --;
                    break;
                }
                duplicateZeros ++;
            }   
                
        }
        
        int last = length - duplicateZeros;

        for (int i = last; i >= 0; i--){
            if (arr[i]  == 0) {
                arr[i + duplicateZeros] = 0;
                duplicateZeros --;
                arr[i + duplicateZeros] = 0;
            } else {
             arr[i + duplicateZeros] = arr[i];
            }
        }

    }
}