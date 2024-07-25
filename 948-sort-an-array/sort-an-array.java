import java.util.Random;

class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = findPivot(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public int findPivot(int[] arr, int low, int high) {
        // Randomized pivot selection to avoid worst-case scenarios
        int pivotIndex = low + (new Random()).nextInt(high - low + 1);
        swap(arr, pivotIndex, low); // Move pivot to the start
        int pivot = arr[low];

        int left = low + 1;
        int right = high;

        while (left <= right) {
            // Find the first element greater than the pivot
            while (left <= right && arr[left] <= pivot) {
                left++;
            }
            // Find the first element smaller than or equal to the pivot
            while (left <= right && arr[right] > pivot) {
                right--;
            }
            // Swap elements if left is still left of right
            if (left < right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        // Place the pivot in its correct position
        swap(arr, low, right);
        return right;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
