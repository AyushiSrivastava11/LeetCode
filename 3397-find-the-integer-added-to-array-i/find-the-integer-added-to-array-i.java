class Solution {
    // public int addedInteger(int[] nums1, int[] nums2) 
    // {
    //  int sum1=0,sum2=0;
    //  for(int nums : nums1)
    //  {
    //     sum1+=nums;
    //  }
    //  for(int nums:nums2)
    //  {
    //     sum2+=nums;
    //  }
    //  return (sum2-sum1)/nums1.length;

    // }

    public int addedInteger(int[] nums1, int[] nums2)
    {
        int max1=0,max2=0;
        for(int index=0;index<nums1.length;index++)
        {
            max1=Math.max(nums1[index],max1);
            max2=Math.max(nums2[index],max2);
        }
        return max2-max1;
    }
}