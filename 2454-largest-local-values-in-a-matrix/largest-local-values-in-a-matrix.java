class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] ans = new int[n-2][n-2];
        for (int k = 0; k< n-2; k++){
            for (int l = 0; l< n-2; l++){
                ans[k][l] = findmax(grid, k+1, l+1);
            }
        }
        return ans;
    }

    private int findmax(int[][] grid, int r, int c){
        int n = grid.length;
        int max = grid[r][c];
        for(int i = r-1; i< r+2; i++){
            for (int j = c-1; j<c+2; j++){
                max = Math.max(grid[i][j], max);
            }
        }
        return max;
    }
}