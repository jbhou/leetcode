package leetcode.interview;

import java.util.HashSet;
import java.util.Set;

public class GeekSolutionLongestSubString3 {

    /**
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     * <p>
     * 示例 1:
     * <p>
     * 输入: "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     * 示例 2:
     * <p>
     * 输入: "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     * 示例 3:
     * <p>
     * 输入: "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     */


    public int lengthOfLongestSubstring(String s) {


        int m = 0;
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0, n = s.length();
        while (i < n && j < n) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i++));
                m = Math.max(m, i - j);
            } else {
                set.remove(s.charAt(j++));
            }

        }


        return m;
    }

    public static void main(String[] args) {

        System.err.println(new GeekSolutionLongestSubString3().lengthOfLongestSubstring("aac"));


    }

}
