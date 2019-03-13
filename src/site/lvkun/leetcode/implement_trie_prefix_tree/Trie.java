package site.lvkun.leetcode.implement_trie_prefix_tree;

public class Trie {

    private static class Node {
        private Node[] next;
        private char value;

        private boolean end;

        public Node(char v) {
            next = new Node[26];
            value = v;
            end = false;
        }

        public void append(Node node) {
            next[node.value - 'a'] = node;
        }

        public Node get(char c) {
            return next[c - 'a'];
        }

        public void setIsEnd(boolean end) {
            this.end = end;
        }

        public boolean isEnd() {
            return end;
        }
    }

    private Node root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new Node('a');
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node parent = root;
        for (char c : word.toCharArray()) {
            if (parent.get(c) != null) {
                parent = parent.get(c);
            } else {
                Node n = new Node(c);
                parent.append(n);
                parent = n;
            }
        }
        parent.setIsEnd(true);
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node parent = root;
        for (char c : word.toCharArray()) {
            if (parent.get(c) == null) {
                return false;
            }

            parent = parent.get(c);
        }
        return parent.isEnd();
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node parent = root;
        for (char c : prefix.toCharArray()) {
            if (parent.get(c) == null) {
                return false;
            }

            parent = parent.get(c);
        }
        return true;
    }
}
