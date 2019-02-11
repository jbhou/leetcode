package leetcode;

public class SolutionFirstMissingPositive {


    public int firstMissingPositive(int[] nums) {


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {//nums[i]为正数，放在i+1位置
                //假设交换的数据还是大于0且<i+1，则放在合适的位置,且数据不相等，避免死循环
                //这个while是关键，其它都是没有难度的
                while (nums[i] > 0 && nums[i] < i + 1 && nums[i] != nums[nums[i] - 1]) {
                    swap(nums, nums[i] - 1, i);
                }
            }
        }
        //循环寻找不符合要求的数据，返回
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        //假设都符合要求，则返回长度+1的值
        return nums.length + 1;


    }


    public void swap(int[] nums, int i, int j) {
        int a = nums[i];
        nums[i] = nums[j];
        nums[j] = a;

    }


}