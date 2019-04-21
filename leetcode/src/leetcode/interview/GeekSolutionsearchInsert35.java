package leetcode.interview;

public class GeekSolutionsearchInsert35 {


    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * <p>
     * 你可以假设数组中无重复元素。
     * <p>
     * 示例 1:
     * <p>
     * 输入: [1,3,5,6], 5
     * 输出: 2
     * 示例 2:
     * <p>
     * 输入: [1,3,5,6], 2
     * 输出: 1
     * 示例 3:
     * <p>
     * 输入: [1,3,5,6], 7
     * 输出: 4
     * 示例 4:
     * <p>
     * 输入: [1,3,5,6], 0
     * 输出: 0
     */


    public int searchInsert(int[] nums, int target) {


        if (nums.length == 0) {
            return 0;
        }


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target)
                return i;
        }

        return nums.length;

    }


    public int binarySearchInsert(int[] nums, int target) {

        if (nums.length == 0) return 0;
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int m = l + ((r - l) >> 1);
            if (target == nums[m] || ((m == 0 || target > nums[m - 1]) && target < nums[m])) return m;
            if (target > nums[m]) l = m + 1;
            else r = m - 1;
        }
        return nums.length;
    }

    public static void main(String[] args) {
        System.err.println(new GeekSolutionsearchInsert35().binarySearchInsert(new int[]{1, 3}, 8));


    }

}
