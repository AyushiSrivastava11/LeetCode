class Solution {
    public int addedInteger(int[] nums1, int[] nums2) 
    {
     int sum1=0,sum2=0;
     for(int nums : nums1)
     {
        sum1+=nums;
     }
     for(int nums:nums2)
     {
        sum2+=nums;
     }
     return (sum2-sum1)/nums1.length;

    }
}