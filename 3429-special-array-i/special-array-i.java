class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int index = 1; index<nums.length;index++){
            int first = nums[index-1] % 2;
            int second = nums[index] % 2;
            if( first == second ){
                return false;
            }
        }
        return true;
    }
}