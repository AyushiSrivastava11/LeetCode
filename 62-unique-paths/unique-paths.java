class Solution {
    public int uniquePaths(int m, int n) {
        int ans[][]=new int[m][n];
        for(int[] arr :ans)
        {
            Arrays.fill(arr,1);
        }
        for(int i=1;i<m;++i)
        {
            for(int j=1;j<n;++j)
            {
                ans[i][j]=ans[i-1][j]+ans[i][j-1];
            }
        }
        return ans[m-1][n-1];
    }
}