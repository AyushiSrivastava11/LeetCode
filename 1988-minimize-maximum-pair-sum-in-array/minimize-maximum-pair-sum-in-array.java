class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int start=0,end=nums.length-1,minMaxPair=Integer.MIN_VALUE;
        while(start < end)
        {
            int curenPair=nums[start]+nums[end];
            minMaxPair=Math.max(minMaxPair,curenPair);
            start++;
            end--;
        }
        return minMaxPair;
    }
}