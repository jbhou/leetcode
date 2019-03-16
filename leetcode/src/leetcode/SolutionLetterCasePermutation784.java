package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SolutionLetterCasePermutation784 {


    /**
     * 参考:https://www.jianshu.com/p/ae8342f62716
     *
     * @param args
     */
    public static void main(String[] args) {
        System.err.println(new SolutionLetterCasePermutation784().letterCasePermutation("123abcd"));

    }


    /**
     * 看完题可以这样想，
     * 从头开始遍历字符串s，遇到第一个字母,
     * 就分两条路走，第一条是以小写拼接后续的字符串，
     * 第二条是用大写拼接，那么每次遇到字母都这样分化，
     * 画图出来很像一颗树，那么就变成了遍历树，
     * 所以用递归比较直观。
     *
     * @param s
     * @return
     */


    public List<String> letterCasePermutation(String s) {

        List<String> result = new ArrayList<>();
        if (s == null) {
            return result;
        }

        recursion(s, "", 0, result);
        return result;


    }

    private void recursion(String s, String tmp, int index, List<String> result) {


        if (index >= s.length()) {
            result.add(tmp);
            return;
        }


        char c = s.charAt(index);
        if (Character.isLetter(c)) {

            recursion(s, tmp + Character.toLowerCase(c), index + 1, result);
            recursion(s, tmp + Character.toUpperCase(c), index + 1, result);

        } else
            recursion(s, tmp + c, index + 1, result);


    }


}
