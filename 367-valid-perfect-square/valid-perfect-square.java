class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 0 || num == 1)
            return true;
        int start = 2, end = num / 2;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid == num / mid && num % mid == 0)
                return true;
            if (num / mid > mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}