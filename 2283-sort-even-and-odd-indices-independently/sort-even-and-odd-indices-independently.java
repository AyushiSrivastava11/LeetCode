class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        int[] evenIndices = new int[(n + 1) / 2];
        int[] oddIndices = new int[n / 2];
        
        // Separate even and odd indices
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenIndices[i / 2] = nums[i];
            } else {
                oddIndices[i / 2] = nums[i];
            }
        }
        
        // Sort even indices in ascending order
        Arrays.sort(evenIndices);
        
        // Sort odd indices in descending order
        Arrays.sort(oddIndices);
        reverseArray(oddIndices);
        
        // Merge sorted even and odd indices back into nums
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = evenIndices[i / 2];
            } else {
                nums[i] = oddIndices[i / 2];
            }
        }
        
        return nums;
    }
    
    private void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}