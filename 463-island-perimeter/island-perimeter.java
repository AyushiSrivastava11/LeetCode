class Solution 
{
    public int islandPerimeter(int[][] grid) 
    {
        int result=0;
        for(int row=0;row<grid.length;row++)
        {
            for(int col=0;col<grid[row].length;col++)
            {
                if(grid[row][col] == 1)
                {
                    result+=4;
                    if (row > 0 && grid[row - 1][col] == 1)
                    {
                        result -= 2; 
                    }
                    if (col > 0 && grid[row][col - 1] == 1) 
                    {
                        result -= 2; 
                    }
                }
            }
        } 
        return result;  
    }
}