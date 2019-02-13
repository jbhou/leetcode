package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SolutionGenerateParenthesis {


    public static void main(String[] args) {

        System.err.println(new SolutionGenerateParenthesis().generateParenthesis(3));

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

}
