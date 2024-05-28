class Solution {
    public int rob(int[] nums) 
    {
        if(nums.length == 1) return nums[0];

        int[] arr1=new int[nums.length];
        int[] arr2=new int[nums.length];

        for(int index=0;index<nums.length;index++)
        {
            if(index!=0){
                arr1[index]=nums[index];
            }
            if(index!=nums.length-1)
            {
                arr2[index]=nums[index];
            }
        }

        return Math.max(rob2(arr1),rob2(arr2));

    }

     public int rob2(int[] nums) 
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