class Solution {
    static final int mod = 1000000007;

    public int checkRecord(int n) {
        long[][] mat = new long[][]{
            {1, 1, 1, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 1, 0}
        };

        long[][] res = pow(mat, n);
        long ans = 0;

        long[] initial = {1, 0, 0, 0, 0, 0};
        for(int i=0; i<=5; i++){
            long sum = 0;
            for(int j=0; j<=5; j++){
                sum = (sum + res[i][j] * initial[j]) % mod;
            }
            ans = (ans + sum) % mod;
        }
        return (int) (ans);
    }

    public long[][] pow(long[][] mat, int n) {
        long[][] ret = {{1, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 1, 0}, {0, 0, 0, 0, 0, 1}};
        while (n > 0) {
            if ((n % 2) == 1) {
                ret = multiply(ret, mat);
            }
            n /= 2;
            mat = multiply(mat, mat);
        }
        return ret;
    }

    public long[][] multiply(long[][] a, long[][] b) {
        long[][] c = new long[6][6];
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                c[i][j] = 0; 
                for (int k = 0; k <= 5; k++) {
                    c[i][j] = (c[i][j] + a[i][k] * b[k][j]) % mod;
                }
            }
        }
        return c;    
    }


}