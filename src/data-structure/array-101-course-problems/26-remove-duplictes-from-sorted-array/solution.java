class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int l = nums.length - 1;
        int previousElt = 101;
        
        for (int i = 0; i <= l; i++){
            
            if(nums[i] != previousElt){
                int el = nums[i];
                nums[k] = el;
                previousElt = el;
                k++;
            }
        }
        
        return k;
    }
}