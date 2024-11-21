class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] ans = new int[m][n];
        int[][] directions={{-1,0},{1,0},{0,-1},{0,1}};

        for(int[] wall : walls ){
            ans[wall[0]][wall[1]] = -1;
        }
        for(int[] guard : guards ){
            ans[guard[0]][guard[1]] = 2;
        }

        for(int[] guard: guards){
            for(int[] direction : directions){
                int x= guard[0];
                int y= guard[1];
                while(true){
                    x+=direction[0];
                    y+=direction[1];
                    if(x<0 || x>=m || y<0 || y>=n || ans[x][y] == -1 || ans[x][y] == 2){
                        break;
                    }
                    if(ans[x][y] == 0){
                        ans[x][y]=1;
                    }
                }
            }
        }
        int result=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (ans[i][j] == 0) {
                    result++;
                }
            }
        }
        return result;
    }
}