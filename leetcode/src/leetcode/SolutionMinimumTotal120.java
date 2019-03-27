package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionMinimumTotal120 {

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
//        [[2],[3,4],[6,5,7],[4,1,8,3]]
        list.add(Arrays.asList(2));
        list.add(Arrays.asList(3, 4));
        list.add(Arrays.asList(6, 5, 7));
        list.add(Arrays.asList(4, 1, 8, 3));

        System.err.println(new SolutionMinimumTotal120().minimumTotal(list));
    }

    public int minimumTotal(List<List<Integer>> triangle) {

        int rowSize = triangle.size();
        for (int i = rowSize - 2; i >= 0; i--) {
            int length = triangle.get(i).size();
            for (int j = 0; j < length; j++) {
                int min = Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));
                triangle.get(i).set(j, min + triangle.get(i).get(j));
            }
        }
        return triangle.get(0).get(0);
    }

}
