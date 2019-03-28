package leetcode;

public class SolutionNumArray {

    public static void main(String[] args) {
    }


    class NumArray {

        private int[] sums;

        public NumArray(int[] nums) {
            sums = new int[nums.length];
            if (nums.length == 0) {
                return;
            }
            sums[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                sums[i] += sums[i - 1] + nums[i];
            }
        }

        public int sumRange(int i, int j) {
            if (i == 0) {
                return sums[j];
            } else {
                return sums[j] - sums[i - 1];
            }
        }
    }

//    static class NumArray {
//
//        private int[] nums;
//
//        public NumArray(int[] nums) {
//            this.nums = nums;
//        }
//
//        public int sumRange(int i, int j) {
//            int sum = 0;
//            for (; i <= j; i++) {
//                sum += nums[i];
//            }
//            return sum;
//        }
//    }
}
