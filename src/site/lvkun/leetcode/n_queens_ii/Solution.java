package site.lvkun.leetcode.n_queens_ii;

import java.util.ArrayList;
import java.util.List;

class Solution {
    class Board {
        private boolean[] columns;
        private boolean[] slashRight;
        private boolean[] slashLeft;

        private char[][] board;
        private int n;

        public Board(int n) {
            columns = new boolean[n];
            slashRight = new boolean[2 * n - 1];
            slashLeft = new boolean[2 * n - 1];
            board = new char[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    board[i][j] = '.';
                }
            }

            this.n = n;
        }

        public boolean putQueenAt(int row, int col) {
            if (columns[col] || slashLeft[row + col] || slashRight[row + n - 1 - col]) {
                return false;
            }

            board[row][col] = 'Q';
            columns[col] = true;
            slashLeft[row + col] = true;
            slashRight[row + n - 1 - col] = true;
            return true;
        }

        public void removeQueenAt(int row, int col) {
            board[row][col] = '.';
            columns[col] = false;
            slashLeft[row + col] = false;
            slashRight[row + n - 1 - col] = false;
        }

        List<String> dump() {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                result.add(String.valueOf(board[i]));
            }
            return result;
        }

        public int getDimen() {
            return n;
        }
    }

    private int mCount;

    private void solve(Board board, int row) {
        if (row == board.getDimen()) {
            mCount++;
            return;
        }

        for (int i = 0; i < board.getDimen(); i++) {
            if (board.putQueenAt(row, i)) {
                solve(board, row + 1);
                board.removeQueenAt(row, i);
            }
        }

    }

    public int totalNQueens(int n) {
        Board board = new Board(n);

        solve(board, 0);

        return mCount;
    }
}
