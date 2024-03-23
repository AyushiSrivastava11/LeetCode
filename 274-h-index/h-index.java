
class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] counts = new int[n + 1];

        for (int c : citations) {
            counts[Math.min(c, n)]++;
        }

        // Finding h-index
        int total = 0;
        for (int i = n; i >= 0; i--) {
            total += counts[i];
            if (total >= i) {
                return i;
            }
        }

        return 0;
    }
}
