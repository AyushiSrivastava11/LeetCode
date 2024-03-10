class Solution {
    public int numTrees(int n) {
        long res = 1;
        for (int index = 0; index < n; index++) {
            res *= (2 * n - index);
            res /= (index + 1);
        }
        return (int) (res / (n + 1));
    }
}
