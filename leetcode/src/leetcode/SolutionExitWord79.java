package leetcode;

import java.util.concurrent.atomic.AtomicBoolean;

public class SolutionExitWord79 {


    static class Trie {


        TrieNode root = new TrieNode('/');

        void addWord(String word) {

            TrieNode node = root;

            for (int i = 0; i < word.length(); i++) {


                char c = word.charAt(i);
                int index = calcIndex(c);

                if (node.children[index] == null) {
                    node.children[index] = new TrieNode(c);
                }
                node = node.children[index];
            }
            node.isWord = true;
        }


        boolean isPrefixWith(String prefix) {


            TrieNode node = root;
            for (int i = 0; i < prefix.length(); i++) {
                char c = prefix.charAt(i);
                int index = calcIndex(c);
                if (node.children[index] == null) {
                    return false;
                }
                node = node.children[index];
            }
            return true;


        }

        boolean search(String word) {

            TrieNode node = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                int index = calcIndex(c);
                if (node.children[index] == null) {
                    return false;
                }
                node = node.children[index];
            }
            return node.isWord;
        }

        private int calcIndex(char c) {

            if ('a' <= c && c <= 'z') {
                return c - 'a';
            }
            return (c - 'A') + 26;
        }
    }

    static class TrieNode {
        char value;
        TrieNode[] children;
        boolean isWord;

        public TrieNode(char value) {
            this.value = value;
            this.children = new TrieNode[52];
        }
    }


    boolean[][] visited;
    boolean find = false;


    public boolean exist(char[][] board, String word) {

        if (board.length == 0) {
            return false;
        }
        visited = new boolean[board.length][board[0].length];


        Trie trie = new Trie();

        trie.addWord(word);


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, trie, i, j, "", visited);
                if (find == true)
                    return true;
            }
        }

        return false;
    }

    private void dfs(char[][] board, Trie trie, int i, int j, String s, boolean[][] visited) {

        if (find) return;
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return;
        if (visited[i][j]) return;


        String word = s + board[i][j];

        if (!trie.isPrefixWith(word)) {
            return;
        }
        if (trie.search(word)) {
            find = true;
            return;
        }
        visited[i][j] = true;

        dfs(board, trie, i + 1, j, word, visited);
        dfs(board, trie, i, j + 1, word, visited);
        dfs(board, trie, i - 1, j, word, visited);
        dfs(board, trie, i, j - 1, word, visited);

        visited[i][j] = false;
        return;
    }


    public static void main(String[] args) {


//        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
//        char[][] board = new char[][]{{'b'}, {'A'}};
//

//


        char[][] board = new char[][]{
                {'F', 'Y', 'C', 'E', 'N', 'R', 'D'},
                {'K', 'L', 'N', 'F', 'I', 'N', 'U'},
                {'A', 'A', 'A', 'R', 'A', 'H', 'R'},
                {'N', 'D', 'K', 'L', 'P', 'N', 'E'},
                {'A', 'L', 'A', 'N', 'S', 'A', 'P'},
                {'O', 'O', 'G', 'O', 'T', 'P', 'N'},
                {'H', 'P', 'O', 'L', 'A', 'N', 'O'}};


        System.err.println(new SolutionExitWord79().exist(board, "poland"));


    }

}