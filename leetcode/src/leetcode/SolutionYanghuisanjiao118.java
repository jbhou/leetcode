package leetcode;

import javafx.beans.binding.IntegerBinding;

import java.util.ArrayList;
import java.util.List;

public class SolutionYanghuisanjiao118 {


    public static void main(String[] args) {
        System.err.println(new SolutionYanghuisanjiao118().generate(4));
    }


    public List<List<Integer>> generate(int numRows) {


//        return byLoop(numRows);

        List<List<Integer>> result = new ArrayList<>();

        generate(result, 1, numRows);
        return result;

    }

    /**
     * 递归实现杨辉三角
     *
     * @param result
     * @param current
     * @param numRows
     */
    private void generate(List<List<Integer>> result, int current, int numRows) {


        if (current > numRows) {
            return;
        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        if (current == 1) {
            result.add(list);
        } else if (current == 2) {
            list.add(1);
            result.add(list);
        } else {
            List<Integer> preList = result.get(current - 2);
            for (int i = 1; i < current - 1; i++) {
                list.add(preList.get(i - 1) + preList.get(i));
            }
            list.add(1);
            result.add(list);
        }

        generate(result, current + 1, numRows);


    }

    /**
     * 循环实现杨辉三角
     *
     * @param numRows
     * @return
     */

    private List<List<Integer>> byLoop(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);

            if (i == 1) {
                result.add(list);
            } else if (i == 2) {
                list.add(1);
                result.add(list);
            } else {
                List<Integer> preList = result.get(i - 2);

                for (int j = 1; j < i - 1; j++) {
                    list.add(preList.get(j) + preList.get(j - 1));
                }
                list.add(1);
                result.add(list);
            }

        }
        return result;
    }

}
