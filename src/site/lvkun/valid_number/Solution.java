package site.lvkun.valid_number;

class Solution {

    interface Matcher {
        boolean match(String s);
    }

    abstract class CompositeMatcher implements Matcher {
        private Matcher matcher;
        public Matcher getMatcher() {
            return matcher;
        }

        Matcher compose(Matcher matcher) {
            this.matcher = matcher;
            return this;
        }
    }

    class IntegerMatcher implements Matcher {
        @Override
        public boolean match(String s) {
            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    class DotMatcher extends CompositeMatcher {

        @Override
        public boolean match(String s) {
            int dotIndex = s.indexOf('.');
            if (dotIndex != -1) {
                return getMatcher().match(s.substring(0, dotIndex))
                        && getMatcher().match(s.substring(dotIndex + 1));
            }

            return getMatcher().match(s);
        }
    }

    class SignMatcher extends CompositeMatcher {
        @Override
        public boolean match(String s) {
            if (s.length() == 0) {
                return false;
            }

            if (s.charAt(0) == '-' || s.charAt(0) == '+') {
                return getMatcher().match(s.substring(1));
            }

            return getMatcher().match(s);
        }
    }

    class ExpMatcher implements Matcher {
        private Matcher firstMatcher;
        private Matcher secondMatcher;

        public ExpMatcher(Matcher first, Matcher second) {
            firstMatcher = first;
            secondMatcher = second;
        }

        @Override
        public boolean match(String s) {
            int eIndex = s.indexOf("e");

            if (eIndex != -1) {
                return firstMatcher.match(s.substring(0, eIndex)) && secondMatcher.match(s.substring(eIndex + 1));
            }

            return firstMatcher.match(s);
        }
    }

    public boolean isNumber(String s) {
        s = s.trim();

        Matcher matcher =
                new ExpMatcher(
                    new SignMatcher().compose(
                            new DotMatcher().compose(
                                    new IntegerMatcher())),
                    new SignMatcher().compose(
                            new IntegerMatcher()));

        return matcher.match(s);
    }
}
