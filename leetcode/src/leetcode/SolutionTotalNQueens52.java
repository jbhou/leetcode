package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SolutionTotalNQueens52 {


    public int totalNQueens(int n) {


        List<Integer> tmpList = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        dfs(n, 0, tmpList, result, new HashSet<>(), new HashSet<>(), new HashSet<>());
        return result.size();
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
            qPositions.remove((Integer) col);
        }


    }
}
