package site.lvkun.word_search;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;

class Solution {

    class Position {
        int row;
        int col;

        public Position(int x, int y) {
            this.row = x;
            this.col = y;
        }
    }

    class Board {
        private char[][] data;
        private HashMap<Character, List<Position>> charPositionMap;
        private int row;
        private int col;
        private BitSet visited;

        public Board(char[][] data) {
            this.data = data;
            this.row = data.length;
            this.col = data[0].length;
            this.charPositionMap = new HashMap<>();
            this.visited = new BitSet();

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    char c = data[i][j];
                    charPositionMap.putIfAbsent(c, new ArrayList<>());
                    charPositionMap.get(c).add(new Position(i, j));
                }
            }
        }

        public List<Position> getPositionsOf(char c) {
            return charPositionMap.get(c);
        }

        private List<Position> neighborOf(Position position) {
            List<Position> positionList = new ArrayList<>();

            if (position.row > 0) {
                positionList.add(new Position(position.row - 1, position.col));
            }

            if (position.col > 0) {
                positionList.add(new Position(position.row, position.col - 1));
            }

            if (position.row + 1 < row) {
                positionList.add(new Position(position.row + 1, position.col));
            }

            if (position.col + 1 < col) {
                positionList.add(new Position(position.row, position.col + 1));
            }

            return positionList;
        }

        private void setVisited(Position position) {
            int index = position.row * col + position.col;
            visited.set(index);
        }

        private boolean isVisited(Position position) {
            int index = position.row * col + position.col;
            return visited.get(index);
        }

        private char charAt(Position position) {
            return data[position.row][position.col];
        }

        public void clearVisited() {
            visited.clear();
        }

        public boolean searchFrom(Position position, char[] charList, int index) {
            if (charAt(position) != charList[index]) {
                return false;
            }

            if (index == charList.length - 1) {
                return true;
            }

            setVisited(position);

            for (Position pos : neighborOf(position)) {
                if (!isVisited(pos)) {
                    if (searchFrom(pos, charList, index + 1)) {
                        return true;
                    }
                }
            }

            return false;
        }
    }

    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0) {
            return false;
        }

        if (word == null || word.length() == 0) {
            return false;
        }

        Board b = new Board(board);

        char firstChar = word.charAt(0);
        for (Position pos : b.getPositionsOf(firstChar)) {
            b.clearVisited();
            if (b.searchFrom(pos, word.toCharArray(), 0)) {
                return true;
            }
        }

        return false;
    }
}
