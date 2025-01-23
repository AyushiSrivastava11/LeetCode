class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int index = 0; index <= n; index++) {
            ans[index] = hammingWeight(index);
        }
        return ans;
    }

    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
}