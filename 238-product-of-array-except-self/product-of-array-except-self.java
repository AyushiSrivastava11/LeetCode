class Solution {
    public int[] productExceptSelf(int[] nums)
    {
        int[] prefix=new int[nums.length];
        int[] suffix=new int[nums.length];
        int[] ans=new int[nums.length];
        prefix[0]=1;
        suffix[nums.length-1]=1;
        for(int index=1;index<nums.length;index++)
        {
            prefix[index]=prefix[index-1]*nums[index-1];
        }
        for(int index=nums.length-2;index>=0;index--)
        {
            suffix[index]=suffix[index+1]*nums[index+1];
        }
        for(int index=0;index<nums.length;index++)
        {
            ans[index]=prefix[index]*suffix[index];
        }
        return ans;
    }
}