class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int row = box.length;
        int col = box[0].length;

        for (int index = 0; index < row; index++) {
            applyGravity(box, index, col);
        }

        // Rotate the box 90 degrees clockwise
        char[][] rotatedBox = new char[col][row];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                rotatedBox[c][row - 1 - r] = box[r][c];
            }
        }

        return rotatedBox;
    }

    public void applyGravity(char[][] box, int row, int col) {
        int emptyIndex = col - 1; 
        for (int index = col - 1; index >= 0; index--) {
            if (box[row][index] == '#') {
                box[row][index] = '.';
                box[row][emptyIndex] = '#';
                emptyIndex--;
            } else if (box[row][index] == '*') {
                emptyIndex = index - 1;
            }
        }
    }
}
