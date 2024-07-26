class Solution {
    public int maxSubArray(int[] nums) {
        
        //Kadane's Algorithm
        int maximum=Integer.MIN_VALUE,sum=0;
        for(int num : nums)
        {
            sum+=num;
            maximum=Math.max(maximum,sum);
            sum=(sum<0)?0:sum;
        }
        return maximum;
    }
}