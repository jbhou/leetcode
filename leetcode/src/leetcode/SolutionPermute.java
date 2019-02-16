package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SolutionPermute {


//    算法思路：
//
//            (1)n个元素的全排列=（n-1个元素的全排列）+（另一个元素作为前缀）；
//
//            (2)出口：如果只有一个元素的全排列，则说明已经排完，则输出数组；
//
//            (3)不断将每个元素放作第一个元素，然后将这个元素作为前缀，并将其余元素继续全排列，等到出口，出口出去后还需要还原数组；

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
