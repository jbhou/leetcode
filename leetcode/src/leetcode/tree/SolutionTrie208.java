package leetcode.tree;

public class SolutionTrie208 {


    static class Trie {

        private final TrieNode root;


        /**
         * Initialize your data structure here.
         */
        public Trie() {
            root = new TrieNode(' ');
        }

        /**
         * Inserts a word into the trie.
         */
        public void insert(String word) {

            TrieNode node = root;

            for (int i = 0; i < word.length(); i++) {

                char c = word.charAt(i);
                if (node.children[c - 'a'] == null) {
                    node.children[c - 'a'] = new TrieNode(c);
                }
                node = node.children[c - 'a'];
            }
            node.end = true;


        }

        /**
         * Returns if the word is in the trie.
         */
        public boolean search(String word) {

            TrieNode node = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (node.children[c - 'a'] == null) return false;
                node = node.children[c - 'a'];
            }
            return node.isEnd();
        }

        /**
         * Returns if there is any word in the trie that starts with the given prefix.
         */
        public boolean startsWith(String prefix) {
            TrieNode node = root;
            for (int i = 0; i < prefix.length(); i++) {
                char c = prefix.charAt(i);
                if (node.children[c - 'a'] == null) return false;
                node = node.children[c - 'a'];
            }
            return true;
        }


        static class TrieNode {


            private boolean end;
            private TrieNode[] children;
            private char value;

            public TrieNode(char value) {
                this.value = value;
                children = new TrieNode[26];
            }

            public boolean isEnd() {
                return end;
            }

            public void setEnd(boolean end) {
                this.end = end;
            }

            public TrieNode[] getChildren() {
                return children;
            }

            public void setChildren(TrieNode[] children) {
                this.children = children;
            }

            public char getValue() {
                return value;
            }

            public void setValue(char value) {
                this.value = value;
            }
        }

    }
}
