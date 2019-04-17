package leetcode.interview;

import java.util.ArrayList;
import java.util.List;

public class GeekSolutionGenerateParenthesis22 {


    /**
     * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
     * <p>
     * 例如，给出 n = 3，生成结果为：
     * <p>
     * [
     * "((()))",
     * "(()())",
     * "(())()",
     * "()(())",
     * "()()()"
     * ]
     */


    /**
     * 两种解法:
     * 1:暴力
     * 2:一共2N个长度,每一位有两种可能, 共O(2^n个可能),然后再筛选正确的
     * 3:生成括号时判断当前括号是否合法,合法的标准是  N个左括号和N个右括号(最优)
     *
     * @param n
     * @return
     */

    public List<String> generateParenthesis(int n) {


        List<String> result = new ArrayList<>();
        generateParenthesis(n, n, "", result);
        return result;

    }

    private void generateParenthesis(int left, int right, String s, List<String> result) {

        if (left == 0 && right == 0) {
            result.add(s);
            return;
        }

        if (left > 0) {
            generateParenthesis(left - 1, right, s + "(", result);
        }
        if (right > left && right > 0) {
            generateParenthesis(left, right - 1, s + ")", result);
        }
    }


    public static void main(String[] args) {

        System.err.println(new GeekSolutionGenerateParenthesis22().generateParenthesis(3));

    }


}
