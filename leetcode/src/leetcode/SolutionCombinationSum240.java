package leetcode;

import java.util.*;

public class SolutionCombinationSum240 {


    public static void main(String[] args) {
        List<List<Integer>> result = new SolutionCombinationSum240().combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);


        System.err.println(result);

    }


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {


        Set<List<Integer>> result = new HashSet<>();

        Arrays.sort(candidates);

        find(candidates, target, 0, 0, result, new ArrayList<>());



        return new ArrayList<>(result);

    }


    public void find(int[] c, int target, int sum, int index, Set<List<Integer>> result, List<Integer> list) {


        if (sum == target) {
            result.add(new ArrayList<>(list));
        }

        for (int j = index; j < c.length && sum + c[j] <= target; j++) {


            list.add(c[j]);
            find(c, target, sum + c[j], j + 1, result, list);
            list.remove((Integer) c[j]);
        }


    }


}
