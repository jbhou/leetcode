package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionSubsets78 {


    public static void main(String[] args) {
        System.err.println(new SolutionSubsets78().subsets(new int[]{1, 2, 3}));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();//record the final answer
        List<Integer> tempList = new ArrayList<>();//record one of the subSet
        Arrays.sort(nums);
        int len = nums.length;//prevent calculating the length in the function
        addToResult(list, tempList, 0, nums, len); //整个数组的全部子集.加到Result list 中,
        return list;
    }


    /**
     *   将数组的子集加到list中
     * @param list
     * @param tempList
     * @param startIndex
     * @param nums
     * @param endIndex
     */

    private void addToResult(List<List<Integer>> list, List<Integer> tempList, int startIndex, int[] nums, int endIndex) {
        list.add(new ArrayList<>(tempList));//by calling itself to add tempList to the list
        for (int i = startIndex; i < endIndex; i++) {
            tempList.add(nums[i]);// add element to tempList
            addToResult(list, tempList, i + 1, nums, endIndex);//calling itself
            tempList.remove(tempList.size() - 1);//backtrack and remove the top element in tempList
        }
    }

}
