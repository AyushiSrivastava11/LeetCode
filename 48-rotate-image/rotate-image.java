class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int row = 0; row < n - 1; row++) {
            for (int col = row + 1; col < n ; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        // for (int row = 0; row < n ; row++) {
        //     for (int col = 0; col < n ; col++) {
        //        System.out.print(matrix[row][col]+ " ");
        //     }
        //     System.out.println();
        // }
        reverse2DArray(matrix);
        for (int row = 0; row < n ; row++) {
            for (int col = 0; col < n ; col++) {
               System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }

    }

    public void reverse2DArray(int[][] array) {
        // Reverse each row
        for(int row=0;row<array.length;row++){
           reverse1DArray(array[row]);
        }
    }

    public void reverse1DArray(int[] arr){
        int start =0 ,end=arr.length-1;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    
}