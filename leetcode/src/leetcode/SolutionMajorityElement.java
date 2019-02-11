package leetcode;

import java.util.Arrays;

public class SolutionMajorityElement {
    /**
     * 排序,中间的就是结果
     */

    public int majorityElement(int[] nums) {

        Arrays.sort(nums);

        if (nums.length % 2 == 0) {
            return nums[nums.length / 2];
        } else {
            return nums[(nums.length - 1) / 2];
        }


    }

}
