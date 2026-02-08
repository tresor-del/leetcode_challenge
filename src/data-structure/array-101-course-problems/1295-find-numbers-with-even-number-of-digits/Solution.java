public class Solution {
    public int findNumbers(int[] nums) {
        
        int evenNumberDigitCount = 0;
        
        for (int num: nums){
            int count = (int) Math.log10(num) + 1;
            if (count % 2 == 0){
                evenNumberDigitCount ++;
            }
        }
        return evenNumberDigitCount;
    }
}