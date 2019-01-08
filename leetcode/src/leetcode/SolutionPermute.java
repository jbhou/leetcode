package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SolutionPermute {


    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        perm(list, nums, 0, nums.length);
        return list;
    }


    public void perm(List<List<Integer>> result, int[] nums, int begin, int end) {


        if (begin == end) {

            List<Integer> newList = new ArrayList<>();
            for (int i = 0; i < end; i++) {
                newList.add(nums[i]);
            }
            result.add(newList);
        } else {
            for (int i = begin; i < end; i++) {

                swap(nums, begin, i);
                perm(result, nums, begin + 1, end);
                swap(nums, i, begin);
            }

        }


    }

    public void swap(int[] nums, int i, int j) {


        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }


    public static void main(String[] args) {

        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.err.println(new SolutionPermute().permute(a));

    }
}
