class Solution {
    public int countPalindromicSubsequence(String s) {
        final int[][] start = new int[26][];
        final int[] freq = new int[26];
        final char[] str = s.toCharArray();
        int nonFinishCnt = 0;
        for(int i = 0; i < str.length; i++) {
            final int index = str[i] - 'a';
            freq[index]++;
            if (start[index] == null)  {
                nonFinishCnt++;
                start[index] = Arrays.copyOf(freq, freq.length);
            }
        }
        final boolean[] finish = new boolean[26];
        int answer = 0;
        for(int i = str.length - 1; i >= 0; i--) {
            final int index = str[i] - 'a';
            freq[index]--;
            if (!finish[index]) {
                for(int j = 0; j < 26; j++) {
                    if (freq[j] - start[index][j] > 0) {
                        answer++;
                    }
                }

                finish[index] = true;
                if (--nonFinishCnt == 0) {
                    return answer;
                }
            }
        }
        return answer;
    }
}