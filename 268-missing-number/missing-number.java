class Solution {
    public int missingNumber(int[] nums) {
        int[] freq = new int[nums.length + 1];
        for (int num : nums) {
            freq[num]++;
        }
        
        for (int i = 0; i < nums.length + 1; i++) {
            if (freq[i] == 0) {
                return i;
            }
        }
        return 0;
    }
}