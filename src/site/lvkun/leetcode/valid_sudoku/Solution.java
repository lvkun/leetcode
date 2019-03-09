package site.lvkun.leetcode.valid_sudoku;

import site.lvkun.leetcode.common.BitSet;

class Solution {
    private static final int SUDOKU_LENGTH = 9;

    public int boxIndex(int row, int col) {
        return (row / 3) * 3 + col / 3;
    }

    public boolean isValidSudoku(char[][] board) {
        if (board.length != SUDOKU_LENGTH) {
            return false;
        }

        if (board[0].length != SUDOKU_LENGTH) {
            return false;
        }

        BitSet[] rowSet = new BitSet[9];
        BitSet[] colSet = new BitSet[9];
        BitSet[] boxSet = new BitSet[9];
        for (int i = 0; i < 9; i++) {
            rowSet[i] = new BitSet();
            colSet[i] = new BitSet();
            boxSet[i] = new BitSet();
        }

        // check each row
        for (int row = 0; row < SUDOKU_LENGTH; row++) {
            for (int col = 0; col < SUDOKU_LENGTH; col++) {
                char curChar = board[row][col];
                if (Character.isDigit(curChar)) {
                    int i = curChar - '0';
                    if (rowSet[row].get(i)) {
                        return false;
                    }
                    rowSet[row].set(i, true);
                    if (colSet[col].get(i)) {
                        return false;
                    }
                    colSet[col].set(i, true);
                    int boxNum = boxIndex(row, col);
                    if (boxSet[boxNum].get(i)) {
                        return false;
                    }
                    boxSet[boxNum].set(i, true);
                }
            }
        }

        return true;
    }
}
