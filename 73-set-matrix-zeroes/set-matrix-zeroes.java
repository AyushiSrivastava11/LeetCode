class Solution {
    public void setZeroes(int[][] matrix) {
        int col0 = 1;
        int m = matrix.length, n = matrix[0].length;
        
        // First pass: mark rows and columns
        for (int row = 0; row < m; row++) {
            if (matrix[row][0] == 0) col0 = 0;
            for (int col = 1; col < n; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }
        
        // Second pass: set zeroes based on marks
        for (int row = m - 1; row >= 0; row--) {
            for (int col = n - 1; col >= 1; col--) {
                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0;
                }
            }
            if (col0 == 0) matrix[row][0] = 0;
        }
    }
}