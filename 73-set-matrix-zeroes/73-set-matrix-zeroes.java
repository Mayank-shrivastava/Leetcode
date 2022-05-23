class Solution {
    public void setZeroes(int[][] matrix) {
        boolean isRow = false;
        boolean isCol = false;
        int r =  matrix.length;
        int c =  matrix[0].length;

        // check for first col that it contains zero or not
        for(int i = 0; i < r; i++) {
            if(matrix[i][0] == 0) isCol = true;
        }
        // check for first row
        for(int j = 0; j < c; j++) {
            if(matrix[0][j] == 0) isRow = true;
        }

        // traverse over the matrix check if matrix[i][j]==0 mark matrix[i][0] = 0 and matrix[0][j]=0
        for(int i = 1; i < r; i++) {
            for(int j = 1; j < c; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // marking of dummy done now look for dummy and set remaining positions to zeros
        for(int i = 1; i < r; i++) {
            for(int j = 1; j < c; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // look for first row
        if(isRow) {
            for(int j = 0; j < c; j++) matrix[0][j] = 0;
        }

        // look for first col
        if(isCol) {
            for(int i = 0; i < r; i++) matrix[i][0] = 0;
        }
    }
}