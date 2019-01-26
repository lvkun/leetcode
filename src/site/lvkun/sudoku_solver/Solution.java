package site.lvkun.sudoku_solver;


import site.lvkun.common.BitSet;

// TODO: retry
class Solution {
    private static final int SUDOKU_LENGTH = 9;
    private static final char UNKNOWN = '.';

    public static class Board {
        char[][] data;
        BitSet[] rowSet;
        BitSet[] colSet;
        BitSet[] boxSet;

        public Board(char[][] board) {
            data = board;
            rowSet = new BitSet[SUDOKU_LENGTH];
            colSet = new BitSet[SUDOKU_LENGTH];
            boxSet = new BitSet[SUDOKU_LENGTH];
            for (int i = 0; i < SUDOKU_LENGTH; i++) {
                rowSet[i] = new BitSet();
                colSet[i] = new BitSet();
                boxSet[i] = new BitSet();
            }

            for (int row = 0; row < SUDOKU_LENGTH; row++) {
                for (int col = 0; col < SUDOKU_LENGTH; col++) {
                    char c = data[row][col];
                    if (c == UNKNOWN) {
                        continue;
                    }
                    if (!set(row, col, data[row][col])) {
                        throw new IllegalArgumentException("input board is not valid");
                    }
                }
            }
        }

        public char charAt(int row, int col) {
            return data[row][col];
        }

        public int boxIndex(int row, int col) {
            return (row / 3) * 3 + col / 3;
        }

        // return false if invalid after set (row, col) to c
        public boolean set(int row, int col, char c) {
            int i = c - '0';

            if (rowSet[row].get(i)) {
                return false;
            }
            if (colSet[col].get(i)) {
                return false;
            }
            int box = boxIndex(row, col);
            if (boxSet[box].get(i)) {
                return false;
            }

            data[row][col] = c;
            rowSet[row].set(i, true);
            colSet[col].set(i, true);
            boxSet[box].set(i, true);
            return true;
        }

        public void reset(int row, int col) {
            if (data[row][col] != UNKNOWN) {
                int i = data[row][col] - '0';
                rowSet[row].set(i, false);
                colSet[col].set(i, false);
                boxSet[boxIndex(row, col)].set(i, false);
                data[row][col] = '.';
            }
        }
    }

    private boolean solveInternal(Board board, int row, int col) {
        if (row == SUDOKU_LENGTH) {
            return true;
        }
        if (col >= SUDOKU_LENGTH) {
            return solveInternal(board, row + 1, 0);
        }

        if (board.charAt(row, col) == UNKNOWN) {
            for (char c = '1'; c <= '9'; c++) {
                if (board.set(row, col, c)) {
                    if (solveInternal(board, row, col + 1)) {
                        return true;
                    }
                }
                board.reset(row, col);
            }
        } else {
            if (solveInternal(board, row, col + 1)) {
                return true;
            }
        }

        return false;
    }

    public void solveSudoku(char[][] board) {
        if (board == null
                || board.length != SUDOKU_LENGTH
                || board[0].length != 9) {
            return;
        }

        Board sudokuBoard = new Board(board);
        solveInternal(sudokuBoard, 0, 0);
    }
}
