class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] memory = new int[triangle.size() + 1][];
        for (int i = 0; i <= triangle.size(); i++) {
            memory[i] = new int[i + 1];
            Arrays.fill(memory[i], -1);
        }

        int minSum = Integer.MAX_VALUE;
        for (int col = 0; col < triangle.get(0).size(); col++) {
            minSum = Math.min(minSum, dpMinPath(0, col, triangle, memory));
        }
        return minSum;
    }

    public int dpMinPath(int row, int col, List<List<Integer>> triangle, int[][] memory) {
        if (row == triangle.size() - 1) {
            return triangle.get(row).get(col);
        }
        if (col < 0 || col >= triangle.get(row).size()) {
            return Integer.MAX_VALUE;
        }

        if (memory[row][col] != -1) {
            return memory[row][col];
        }

        int leftDown = dpMinPath(row + 1, col, triangle, memory);
        int rightDown = dpMinPath(row + 1, col + 1, triangle, memory);

        return memory[row][col] = triangle.get(row).get(col) + Math.min(leftDown, rightDown);
    }
}
