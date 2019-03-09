package site.lvkun.leetcode.regular_expression_matching;

class Solution {

    interface State {
        State match(char c);
        void setNextState(State nextState);
        State getNextState();
    }

    private static final State NOT_MATCH_STATE = new NotMatchState();

    static class NotMatchState implements State {
        @Override
        public State match(char c) {
            return this;
        }

        @Override
        public void setNextState(State nextState) {
        }

        @Override
        public State getNextState() {
            return NOT_MATCH_STATE;
        }
    }

    static class CharMatchState implements State {
        char matchChar;
        boolean isWildChar;

        State nextState = null;

        public CharMatchState(char c) {
            matchChar = c;
        }

        @Override
        public State match(char c) {
            if (c == matchChar || matchChar == '.') {
                if (isWildChar) {
                    return this;
                }

                return nextState;
            }

            if (isWildChar) {
                return nextState;
            }

            return NOT_MATCH_STATE;
        }

        @Override
        public void setNextState(State state) {
            nextState = state;
        }

        @Override
        public State getNextState() {
            return nextState;
        }
    }

    static class Pattern {
        State curState;
        State firstState;

        boolean match(String s) {
            if (firstState == null) {
                return false;
            }

            curState = firstState;

            for (int i = 0; i < s.length(); i++) {
                curState = curState.match(s.charAt(i));
                if (curState == null || curState == NOT_MATCH_STATE) {
                    return false;
                }
            }

            return curState.getNextState() == null;
        }

        public void addState(State state) {
            if (curState == null) {
                curState = state;
                firstState = state;
                return;
            }

            curState.setNextState(state);
            curState = state;
        }
    }

    public static Pattern compile(String p) {
        Pattern pattern = new Pattern();
        int i = 0;
        while (i < p.length()){
            char curChar = p.charAt(i);
            if (!Character.isAlphabetic(curChar) && curChar != '.') {
                throw new IllegalArgumentException("invalid pattern");
            }

            CharMatchState state = new CharMatchState(curChar);
            i++;

            if (i < p.length()) {
                char nextChar = p.charAt(i);
                if (nextChar == '*') {
                    state.isWildChar = true;
                    i++;
                }
            }

            pattern.addState(state);
        }
        return pattern;
    }

    public boolean isMatch(String s, String p) {
        return compile(p).match(s);
    }
}