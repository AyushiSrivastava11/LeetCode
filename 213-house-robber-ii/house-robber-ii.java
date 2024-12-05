class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int prev1=0,prev2=nums[0],prev3=0,prev4=nums[1];
        for(int index = 1;index<nums.length-1;index++){
            int pick = nums[index] + prev1;
            int no_pick = 0 + prev2;
            int curr = Math.max(pick,no_pick);
            prev1=prev2;
            prev2=curr;
        }
        for(int index = 2;index<nums.length;index++){
            int pick = nums[index] + prev3;
            int no_pick = 0 + prev4;
            int curr = Math.max(pick,no_pick);
            prev3=prev4;
            prev4=curr;
        }
        return Math.max(prev2,prev4);
    }
}