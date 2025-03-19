class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        for(int index = 0;index<nums.length-2;index++){
            if(nums[index] == 0){
                nums[index] = 1;
                nums[index+1] = nums[index+1] == 0? 1:0;
                nums[index+2] = nums[index+2] == 0? 1:0;
                count++;
            }
        }
         if (nums[nums.length - 2] == 0 || nums[nums.length - 1] == 0) return -1;
         return count;
    }
    
}