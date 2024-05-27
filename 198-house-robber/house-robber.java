class Solution 
{
    public int rob(int[] nums) 
    {
        int prev1=nums[0];
        int prev2=0;

        for(int index=1;index<nums.length;index++)
        {
            int take=nums[index];
            if(index>1)
            {
                take+=prev2;
            }

            int notTake=prev1;
            int currIndex=Math.max(take,notTake);
            prev2=prev1;
            prev1=currIndex;
        }
        return prev1;
    }
}