class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) 
    {
        int count=0,result=0,start=0;
        for(int index=0;index<nums.length;index++)
        {
            if(nums[index] == 1)
            {
                goal--;
                count=0;
            }
            while(goal==0 && start<=index)
            {
                goal+=nums[start];
                start++;
                count++;
                if(start>index-goal+1)
                {
                    break;
                }
            }
            while(goal<0)
            {
                goal+=nums[start];
                start++;
            }
            result+=count;
        }
        return result;
    }
}