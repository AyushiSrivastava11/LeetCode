class Solution {
    int islandPerimeter(int[][] grid) {
        int height = grid.length;
        int width = grid[0].length;

        int result = 0;

        for (int y = 0; y < height; y++){
            int prev = 0;
            for (int x = 0; x < width; x++){
                int keep = grid[y][x];
                result += prev ^ keep;
                prev = keep;
            }
            result += prev;
        }
        
        for (int x = 0; x < width; x++){
            int prev = 0;
            for (int y = 0; y < height; y++){
                int keep = grid[y][x];
                result += prev ^ keep;
                prev = keep;
            }
            result += prev;
        }
        return result;
    }
}