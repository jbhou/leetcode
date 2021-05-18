package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SolutionGenerateParenthesis {


    public static void main(String[] args) {

        System.err.println(new SolutionGenerateParenthesis().generateParenthesis(3));
        System.err.println(new SolutionGenerateParenthesis().generate(3));

    }

    public List<String> generate(int n) {
        List<String> list = new ArrayList<>();
        generate(0, 0, n, list, "");
        return list;
    }


    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        doAdd(n, n, list, "");
        return list;
    }

    public static void doAdd(int leftCount, int rightCount, List<String> resultList, String str) {


        if (leftCount == 0 && rightCount == 0) {
            resultList.add(str);
            return;
        }
        if (leftCount != 0)
            doAdd(leftCount - 1, rightCount, resultList, str + "(");
        if (rightCount != 0 && rightCount > leftCount)
            doAdd(leftCount, rightCount - 1, resultList, str + ")");
    }


    public static void generate(int left, int right, int n, List<String> result, String line) {


        if (left == n && right == n) {
            result.add(line);
            return;
        }

        if (left < n) {
            generate(left + 1, right, n, result, line + "(");
        }
        if (right < n && right<left) {
            generate(left, right + 1, n, result, line + ")");
        }
    }


}
