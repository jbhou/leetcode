package leetcode;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SolutionSolveNQueens51 {


    public static void main(String[] args) {

        System.err.println(new SolutionSolveNQueens51().solveNQueens(4));

    }

    public List<List<String>> solveNQueens(int n) {


        List<Integer> tmpList = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        dfs(n, 0, tmpList, result, new HashSet<>(), new HashSet<>(), new HashSet<>());


        return processResult(result, n);


    }

    private List<List<String>> processResult(List<List<Integer>> result, int n) {

        List<List<String>> r = new ArrayList<>();

        for (int count = 0; count < result.size(); count++) {//有几种结果


            List<Integer> rCount = result.get(count); //第count种结果
            List<String> resultCount = new ArrayList<>();
            for (int i = 0; i < rCount.size(); i++) {//每个list中存的是每行的Q位置
                String rowStr = "";
                int col = 0;
                int qIndex = rCount.get(i);
                while (col++ < qIndex) {
                    rowStr += ".";
                }
                rowStr += "Q";
                while (col++ < n) {
                    rowStr += ".";
                }
                resultCount.add(rowStr);
            }
            r.add(resultCount);
        }
        return r;


    }


    public void dfs(int n, int row, List<Integer> qPositions, List<List<Integer>> result, Set<Integer> dif, Set<Integer> sum, Set<Integer> cols) {


        if (row >= n) {
            result.add(new ArrayList<>(qPositions));
//            qPositions.clear();
            return;
        }

        for (int col = 0; col < n; col++) {

            if (cols.contains(col) || dif.contains(row - col) || sum.contains(row + col)) {
                continue;
            }

            sum.add(row + col);
            dif.add(row - col);
            cols.add(col);
            qPositions.add(col);

            dfs(n, row + 1, qPositions, result, dif, sum, cols);

            cols.remove(col);
            sum.remove(row + col);
            dif.remove(row - col);
            qPositions.remove((Integer)col);
        }


    }


}
