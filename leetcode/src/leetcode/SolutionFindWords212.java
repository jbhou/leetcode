package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SolutionFindWords212 {


    class Trie {

        TrieNode root = new TrieNode('/');

        void insert(String word) {
            TrieNode node = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                int index = c - 'a';
                if (node.children[index] == null) {
                    node.children[index] = new TrieNode(c);
                }
                node = node.children[index];
            }
            node.isword = true;
        }


        boolean prefix(String word) {
            TrieNode node = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                int index = c - 'a';
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
                int index = c - 'a';
                if (node.children[index] == null) {
                    return false;
                }
                node = node.children[index];
            }
            return node.isword;
        }

    }

    class TrieNode {
        char value;
        TrieNode[] children = new TrieNode[26];
        boolean isword;

        public TrieNode(char value) {
            this.value = value;
        }
    }


    public List<String> findWords(char[][] board, String[] words) {


        Trie trie = new Trie();


        for (int i = 0; i < words.length; i++) {
            trie.insert(words[i]);
        }
        int m = board.length;
        int n = board[0].length;

        boolean[][] visited = new boolean[m][n];
        Set<String> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(board, i, j, trie, "", set, visited);
            }
        }
        return new ArrayList<>(set);


    }

    private void dfs(char[][] board, int i, int j, Trie trie, String s, Set<String> set, boolean[][] visited) {

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j]) return;


        String word = s + board[i][j];
        if (!trie.prefix(word)) return;
        if (trie.search(word)) {
            set.add(word);
        }

        visited[i][j] = true;

        dfs(board, i + 1, j, trie, word, set, visited);
        dfs(board, i, j + 1, trie, word, set, visited);
        dfs(board, i - 1, j, trie, word, set, visited);
        dfs(board, i, j - 1, trie, word, set, visited);
        visited[i][j] = false;
    }


    public static void main(String[] args) {


        char[][] board = new char[][]{{'a', 'b'}};

        new SolutionFindWords212().findWords(board, new String[]{"ab"});


    }


}
