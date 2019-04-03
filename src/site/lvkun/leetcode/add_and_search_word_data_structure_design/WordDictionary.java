package site.lvkun.leetcode.add_and_search_word_data_structure_design;

class WordDictionary {

    private static class Node {
        private Node[] children;

        /* package */Node() {
        }

        public void add(char[] chars, int pos) {
            if (pos >= chars.length || pos < 0) {
                return;
            }

            if (children == null) {
                children = new Node[26];
            }

            char c = chars[pos];
            Node node = new Node();
            children[c - 'a'] = node;

            node.add(chars, pos + 1);
        }

        public boolean search(char[] chars, int pos) {
            if (pos < 0) {
                return false;
            }

            if (pos >= chars.length) {
                return true;
            }

            char c = chars[pos];
            if (c == '.') {
                for (Node n : children) {
                    if (n != null && n.search(chars, pos + 1)) {
                        return true;
                    }
                }
            } else {
                Node n = children[c - 'a'];
                if (n != null && n.search(chars, pos + 1)) {
                    return true;
                }
            }

            return false;


        }
    }

    private Node root;

    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new Node();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        char[] chars = word.toCharArray();
        root.add(chars, 0);
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        char[] chars = word.toCharArray();
        return root.search(chars, 0);
    }
}
