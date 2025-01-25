class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] num : dp){
            Arrays.fill(num,-1);
        }
        return traverse(m-1,n-1,dp);
    }

    public int traverse(int m,int n, int[][] dp){
        if( m == 0 && n == 0) return 1;
        if( m < 0 || n < 0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        return dp[m][n] = traverse(m-1,n,dp) + traverse(m,n-1,dp);
    }
}