class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE;
        for (int num : nums) {
            sum += num;
            max = Math.max(sum,max);
            sum = (sum<0)?0:sum;
        }
        return max;
    }
}