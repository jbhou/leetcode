package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SolutionPermuteUnique47 {


    public static void main(String[] args) {

        System.err.println(new SolutionPermuteUnique47().permuteUnique(new int[]{1, 1, 2}));


    }


    public List<List<Integer>> permuteUnique(int[] nums) {


        if (nums.length == 0) {
            return new ArrayList<>();
        }


        Set<List<Integer>> set = new HashSet<>();

        permuteRecursion(nums, 0, nums.length, set);

        return new ArrayList<>(set);

    }

    private void permuteRecursion(int[] nums, int begin, int end, Set<List<Integer>> set) {


        if (begin == end) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < end; i++) {
                list.add(nums[i]);
            }
            set.add(list);
        }


        for (int i = begin; i < end; i++) {
            swap(nums, begin, i);
            permuteRecursion(nums, begin + 1, end, set);
            swap(nums, i, begin);
        }


    }

    private void swap(int[] nums, int begin, int end) {

        int t = nums[begin];
        nums[begin] = nums[end];
        nums[end] = t;

    }

}
