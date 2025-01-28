import java.util.*;

class Solution {
    private class Pair {
        int row, col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public int findMaxFish(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int maxFish = 0;

        // Iterate through each cell in the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Start BFS only from unvisited water cells
                if (!visited[i][j] && grid[i][j] > 0) {
                    int fishCount = bfs(i, j, visited, grid, m, n);
                    maxFish = Math.max(maxFish, fishCount);
                }
            }
        }
        return maxFish;
    }

    private int bfs(int row, int col, boolean[][] visited, int[][] grid, int m, int n) {
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(row, col));
        visited[row][col] = true;

        int totalFish = 0;

        // BFS traversal
        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            int curRow = current.row;
            int curCol = current.col;

            // Add the fish count at the current cell
            totalFish += grid[curRow][curCol];

            // Explore the 4 possible directions (up, down, left, right)
            int[] dRow = {-1, 1, 0, 0};
            int[] dCol = {0, 0, -1, 1};

            for (int i = 0; i < 4; i++) {
                int newRow = curRow + dRow[i];
                int newCol = curCol + dCol[i];

                // Check boundaries and if the cell is unvisited and is a water cell
                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n &&
                        !visited[newRow][newCol] && grid[newRow][newCol] > 0) {
                    visited[newRow][newCol] = true;
                    queue.offer(new Pair(newRow, newCol));
                }
            }
        }

        return totalFish;
    }
}
