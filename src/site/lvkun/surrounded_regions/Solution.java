package site.lvkun.surrounded_regions;

import java.util.*;

class Solution {
    private static class Board {
        char[][] mData;
        int mRow;
        int mCol;

        boolean[][] mVisited;

        public Board(char[][] data) {
            mData = data;
            mRow = data.length;
            mCol = data[0].length;

            mVisited = new boolean[mRow][mCol];
        }

        private class Pos {
            int row;
            int col;

            Pos(int row, int col) {
                this.row = row;
                this.col = col;
            }

            List<Pos> adj() {
                List<Pos> adjList = new ArrayList<>();
                if (row > 0) {
                    adjList.add(new Pos(row - 1, col));
                }
                if (row + 1 < mRow) {
                    adjList.add(new Pos(row + 1, col));
                }
                if (col > 0) {
                    adjList.add(new Pos(row, col - 1));
                }
                if (col + 1 < mCol) {
                    adjList.add(new Pos(row, col + 1));
                }
                return adjList;
            }

            public char get() {
                return mData[row][col];
            }

            public void set(char c) {
                mData[row][col] = c;
            }

            public boolean isVisited() {
                return mVisited[row][col];
            }

            public void setVisited() {
                mVisited[row][col] = true;
            }
        }

        public Iterable<Pos> row(int row) {
            return new Iterable<Pos>() {
                @Override
                public Iterator<Pos> iterator() {
                    return new RowIterator(row);
                }
            };
        }

        public Iterable<Pos> col(int col) {
            return new Iterable<Pos>() {
                @Override
                public Iterator<Pos> iterator() {
                    return new ColIterator(col);
                }
            };
        }

        public char charAt(int row, int col) {
            return mData[row][col];
        }

        public void setChar(int row, int col, char c) {
            mData[row][col] = c;
        }

        private class RowIterator implements Iterator<Pos> {
            private int row;
            private int col;
            public RowIterator(int row) {
                this.row = row;
            }

            @Override
            public boolean hasNext() {
                return col < mCol;
            }

            @Override
            public Pos next() {
                return new Pos(row, col++);
            }
        }

        private class ColIterator implements Iterator<Pos> {
            private int row;
            private int col;
            public ColIterator(int col) {
                this.col = col;
            }

            @Override
            public boolean hasNext() {
                return row < mRow;
            }

            @Override
            public Pos next() {
                return new Pos(row++, col);
            }
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < mRow; i++) {
                for (int j = 0; j < mCol; j++) {
                    builder.append(mData[i][j]);
                    builder.append(' ');
                }
                builder.append('\n');
            }

            return builder.toString();
        }
    }


    public void solve(char[][] board) {
        Board b = new Board(board);

        Queue<Board.Pos> queue = new ArrayDeque<>();
        for (Board.Pos pos : b.row(0)) {
            if (pos.get() == 'O') {
                queue.offer(pos);
            }
            pos.setVisited();
        }
        for (Board.Pos pos : b.row(b.mRow - 1)) {
            if (pos.get() == 'O') {
                queue.offer(pos);
            }
            pos.setVisited();
        }
        for (Board.Pos pos : b.col(0)) {
            if (pos.get() == 'O') {
                queue.offer(pos);
            }
            pos.setVisited();
        }
        for (Board.Pos pos : b.col(b.mCol - 1)) {
            if (pos.get() == 'O') {
                queue.offer(pos);
            }
            pos.setVisited();
        }

        while (!queue.isEmpty()) {
            Board.Pos pos = queue.poll();
            pos.set('#');

            for (Board.Pos adjPos : pos.adj()) {
                if (adjPos.isVisited()) {
                    continue;
                }
                if (adjPos.get() == 'O') {
                    queue.offer(adjPos);
                }
                adjPos.setVisited();
            }
        }

        for (int i = 0; i < b.mRow; i++) {
            for (int j = 0; j < b.mCol; j++) {
                if (b.charAt(i, j) == 'O') {
                    b.setChar(i, j, 'X');
                } else if (b.charAt(i, j) == '#') {
                    b.setChar(i, j, 'O');
                }
            }
        }
    }
}