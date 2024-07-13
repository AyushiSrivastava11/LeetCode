class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] temp = new int[k];
        
        // Copy the last k elements to the temp array
        for (int index = 0; index < k; index++) {
            temp[index] = nums[nums.length - k + index];
        }
        
        // Shift the remaining elements to the right
        for (int index = nums.length - 1; index >= k; index--) {
            nums[index] = nums[index - k];
        }
        
        // Copy the elements from temp array to the beginning
        for (int index = 0; index < k; index++) {
            nums[index] = temp[index];
        }
    }
}
