class Solution {
    public int reversePairs(int[] nums) {
        return mergesort_and_count(nums, 0, nums.length - 1);
    }
    public int mergesort_and_count(int[] nums,int start,int end){
        if (start < end) {
        int mid = (start + end) / 2;
        int count = mergesort_and_count(nums, start, mid) + mergesort_and_count(nums, mid + 1, end);
        int j = mid + 1;
        for (int i = start; i <= mid; i++) {
            while (j <= end && nums[i] > (long) nums[j] * 2)
                j++;
            count += j - (mid + 1);
        }
        merge(nums, start, mid, end);
        return count;
    }
    else
        return 0;
    }


    public void merge(int[] nums, int start, int mid, int end)
{
    int n1 = (mid - start + 1);
    int n2 = (end - mid);
    int[] L = new int[n1];
    int[] R = new int[n2];

    for (int i = 0; i < n1; i++)
        L[i] = nums[start + i];
    for (int j = 0; j < n2; j++)
        R[j] = nums[mid + 1 + j];
    int i = 0, j = 0;
    for (int k = start; k <= end; k++) {
        if (j >= n2 || (i < n1 && L[i] <= R[j]))
            nums[k] = L[i++];
        else
            nums[k] = R[j++];
    }
}
}