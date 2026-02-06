package max_consecutives_ones;
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int maxCount = 0;
        int current = 0;

        for (int i = 0; i < nums.length; i++){

            if (nums[i] == 0) {

                if (maxCount > current) {
                    current = maxCount;
                }
                maxCount = 0;
            }
            if (nums[i] == 1) {
                current ++;
            }
        }

        if (current < maxCount) {
            return maxCount;
        } else {
            return current;
        }

    }
}