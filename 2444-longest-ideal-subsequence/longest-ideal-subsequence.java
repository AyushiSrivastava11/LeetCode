class Solution {
    public int longestIdealString(String s, int k) {
        int[] l = new int[128];
        for (char c : s.toCharArray()) {
            int i = (int) c;
            int max = 0;
            for (int j = i - k; j <= i + k; j++) {
                if (j >= 0 && j < 128) {
                    max = Math.max(max, l[j]);
                }
            }
            l[i] = max + 1;
        }
        int maxLen = 0;
        for (int len : l) {
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}
