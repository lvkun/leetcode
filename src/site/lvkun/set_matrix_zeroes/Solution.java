package site.lvkun.set_matrix_zeroes;

class Solution {
    private void setRow(int[][] matrix, int row, int value) {
        for (int i = 0; i < matrix[row].length; i++) {
            matrix[row][i] = value;
        }
    }

    private void setCol(int[][] matrix, int col, int value) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = value;
        }
    }

    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }

        boolean zeroInFirstRow = false;
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                zeroInFirstRow = true;
                break;
            }
        }

        boolean zeroInFirstColumn = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                zeroInFirstColumn = true;
                break;
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                setRow(matrix, i, 0);
            }
        }

        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
               setCol(matrix, i, 0);
            }
        }

        if (zeroInFirstRow) {
            setRow(matrix, 0, 0);
        }

        if (zeroInFirstColumn) {
            setCol(matrix, 0, 0);
        }
    }
}