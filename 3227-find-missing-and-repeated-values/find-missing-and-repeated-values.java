class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];
        int xorRange = 0;
        for(int i = 1; i <= (grid.length* grid.length); i++){
            xorRange ^= i;
        }
        ans[0] = findFreq(grid);
        int xorAll = 0;
         for(int row=0;row<grid.length;row++){
        for(int col = 0;col<grid[0].length;col++){
            xorAll ^= grid[row][col];
        }
       }
       ans[1] = xorAll ^ xorRange ^ ans[0];
       return ans;

    }

    public int findFreq(int[][] grid){
        int[] freq = new int[(grid.length * grid.length) + 1];
       for(int row=0;row<grid.length;row++){
        for(int col = 0;col<grid[0].length;col++){
            if(freq[grid[row][col]] == 1) return grid[row][col];
            freq[grid[row][col]] += 1;
        }
       }
       //Unreachable code
       return 0;
    }
}