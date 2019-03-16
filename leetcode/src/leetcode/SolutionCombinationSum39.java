package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionCombinationSum39 {


    public static void main(String[] args) {

        List<List<Integer>> r = new SolutionCombinationSum39().combinationSum(new int[]{2, 3, 6, 7}, 7);
        System.err.println(r);

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {


        List<List<Integer>> result = new ArrayList<>();


        Arrays.sort(candidates);

        find(candidates, target, 0, 0, result, new ArrayList<>());
        return result;
    }


    public void find(int[] c, int target, int sum, int i, List<List<Integer>> result, List<Integer> list) {


        if (sum == target) {
            result.add(new ArrayList<>(list));
        }


        for (int j = i; j < c.length && sum + c[j] <= target; j++) {


            list.add(c[j]);
            find(c, target, sum + c[j], j, result, list);
            list.remove((Integer) c[j]);

        }


    }


}
