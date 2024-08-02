class Solution {
    public int minSwaps(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int n = nums.length;
        int cnt = 0;
        for (int i = 0; i < sum; ++i) {
            cnt += nums[i];
        }
        int mx = cnt;
        for (int i = sum; i < n + sum; ++i) {
            cnt += nums[i % n] - nums[(i - sum + n) % n];
            mx = Math.max(mx, cnt);
        }
        return sum - mx;
    }
}