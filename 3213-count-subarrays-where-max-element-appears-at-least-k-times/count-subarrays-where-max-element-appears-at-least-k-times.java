class Solution {
    public long countSubarrays(int[] nums, int k) 
    {
        int max=0,count=0,start=0;
        for(int num : nums)
        {
          max=Math.max(max,num);
        }

        for(int num : nums)
        {
            if(num == max)
            {
                count++;
            }
        }

        if(count<k)
        {
            return 0;
        }
        long ans=0;
        count=0;
        for(int end=0;end<nums.length;end++)
        {
            if(nums[end] == max)
            {
                count++;
            }
            while(k == count)
            {
                if(nums[start] == max)
                {
                    count--;
                }
                start++;
            }
            ans+=start;
        }
        return ans;

    }
}