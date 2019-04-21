package leetcode.interview;

public class GeekSolutionlongestCommonPrefix14 {

    /**
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     * <p>
     * 如果不存在公共前缀，返回空字符串 ""。
     * <p>
     * 示例 1:
     * <p>
     * 输入: ["flower","flow","flight"]
     * 输出: "fl"
     * 示例 2:
     * <p>
     * 输入: ["dog","racecar","car"]
     * 输出: ""
     * 解释: 输入不存在公共前缀。
     * 说明:
     * <p>
     * 所有输入只包含小写字母 a-z 。
     */

    static class Trie {

        private TrieNode root = new TrieNode('/');


        public void insert(String str) {

            TrieNode node = root;
            for (int i = 0; i < str.length(); i++) {
                int index = str.charAt(i) - 'a';
                char c = str.charAt(i);
                if (node.childrens[index] == null) {
                    node.childrens[index] = new TrieNode(c);
                    node.childrenCount++;
                }
                node = node.childrens[index];
            }
            node.isWord = true;
        }


        public String getMaxPrefix() {
            TrieNode node = root;
            String prefix = "";

            while (node != null) {
                if (node.childrenCount != 1 || node.isWord) {
                    return prefix;
                }
                for (int i = 0; i < node.childrens.length; i++) {
                    if (node.childrens[i] != null) {
                        prefix += node.childrens[i].value;
                        node = node.childrens[i];
                        break;
                    }
                }
            }
            return prefix;

        }


    }

    static class TrieNode {

        private char value;
        private TrieNode[] childrens;
        private int childrenCount; //子节点数量,判断如果是公共前缀,则说明子节点数量应为1
        private boolean isWord;//是否是单词

        public TrieNode(char value) {
            this.value = value;
            childrens = new TrieNode[26];
        }

        public char getValue() {
            return value;
        }

        public void setValue(char value) {
            this.value = value;
        }

    }


    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        Trie trie = new Trie();
        for (String s : strs) {
            trie.insert(s);
        }
        return trie.getMaxPrefix();
    }


    public static void main(String[] args) {

        GeekSolutionlongestCommonPrefix14 g = new GeekSolutionlongestCommonPrefix14();
        String s = g.longestCommonPrefix(new String[]{"abcf", "abcd", "abcg", "abcm"});
        System.err.println(s);

    }


}
