/**
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE
 * file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package leetcode;

import java.time.Period;
import java.util.Arrays;

/**
 * ClassName:SoluationLongestCommonPrefix <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月26日 下午1:43:16 <br/>
 *
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public class SoluationLongestCommonPrefix14 {
    public String longestCommonPrefix(String[] strs) {


        Trie trie = new Trie();

        for (String s : strs) {
            trie.addWord(s);
        }

        return trie.getMaxPrefix();


//        int minLength = Integer.MAX_VALUE;
//        String minStr = "";
//        for (String str : strs) {
//            if (str.length() < minLength) {
//                minStr = str;
//                minLength = str.length();
//            }
//        }
//        if (minLength == 0 || strs.length == 0) {
//            return "";
//        }
//        for (int i = 0; i < minLength; i++) {
//            char c = minStr.charAt(i);
//            for (String str : strs) {
//                if (str.charAt(i) != c) {
//                    return minStr.substring(0, i);
//                }
//            }
//        }
//        return minStr;
    }


    static class Trie {


        private TrieNode root = new TrieNode(' ');

        public void addWord(String word) {
            TrieNode node = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (node.childrens[c - 'a'] == null) {
                    node.childrens[c - 'a'] = new TrieNode(c);
                    node.increaseChildrenCount();
                }
                node = node.childrens[c - 'a'];
            }
            node.word = true;
        }


        private String getMaxPrefix() {
            TrieNode node = root;

            String prefix = "";
            while (node != null) {
                if (node.childrenCount != 1 || node.word) {
                    return prefix;
                }

                for (int i = 0; i < node.childrens.length; i++) {
                    if (node.childrens[i] != null) {
                        node = node.childrens[i];
                        break;
                    }
                }
                prefix += node.value;
            }

            return prefix.trim();
        }


    }

    static class TrieNode {
        private char value;
        private TrieNode[] childrens;
        private int childrenCount;
        private boolean word;


        public TrieNode(char value) {
            this.value = value;
            this.childrens = new TrieNode[26];
        }

        public int getChildrenCount() {
            return childrenCount;
        }

        public void increaseChildrenCount() {
            childrenCount++;
        }

        @Override
        public String toString() {
            return "TrieNode{" +
                    "value=" + value +
                    ", childrens=" + Arrays.toString(childrens) +
                    ", childrenCount=" + childrenCount +
                    ", word=" + word +
                    '}';
        }
    }


    public static void main(String[] args) {
//        String s = new SoluationLongestCommonPrefix14().longestCommonPrefix(new String[]{""});


        String[] ss = new String[]{"abc", "abcd", "abcdf"};
        String s = new SoluationLongestCommonPrefix14().longestCommonPrefix(ss);

        System.err.println(s);
    }
}
