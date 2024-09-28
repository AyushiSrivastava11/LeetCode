class Solution {
    public void nextPermutation(int[] nums) {
        int breakPoint = -1, length = nums.length;
        for (int index = length - 2; index >= 0; index--) {
            if (nums[index] < nums[index + 1]) {
                breakPoint = index;
                break;
            }
        }
        if (breakPoint == -1) {
            reverse(nums, length);
            return;
        } else {
            for (int index = length - 1; index >= breakPoint; index--) {
                if (nums[index] > nums[breakPoint]) {
                    int temp = nums[index];
                    nums[index] = nums[breakPoint];
                    nums[breakPoint] = temp;
                    break;
                }
            }
            int[] subArray = Arrays.copyOfRange(nums, breakPoint + 1, length);
            Arrays.sort(subArray);
            System.arraycopy(subArray, 0, nums, breakPoint + 1, subArray.length);
            System.out.println(Arrays.toString(nums));
        }
    }

    public void reverse(int[] a, int n) {
        int start = 0, end = n - 1;
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }

        System.out.println("Reversed array is: " + Arrays.toString(a));
    }

}