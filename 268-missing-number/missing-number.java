class Solution {
    public int missingNumber(int[] nums) {
       int ans=0;
       for(int index=1;index<=nums.length;index++)
       {
        ans^=nums[index-1];
        ans^=index;
       }
       return ans;
    }
}