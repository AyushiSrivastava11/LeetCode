class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = { -1, -1 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            if (map.containsKey(target - nums[index])) {
                ans[0] = map.get(target - nums[index]);
                ans[1] = index;
                break;
            } else {
                map.put(nums[index], index);
            }
        }
        return ans;
    }
}