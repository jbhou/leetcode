package leetcode;

public class SolutionMaxProduct152 {

    int maxProduct = Integer.MIN_VALUE;

    /**
     * @param nums
     * @return
     */
    public int maxProduct(int[] nums) {


//        recursion(nums, 0, 1);
//        return maxProduct;
        return dp(nums);
    }


    /**
     * 动态规划
     *
     * @param nums
     * @return
     */
    public int dp(int[] nums) {


        int[] max = new int[nums.length];
        int[] min = new int[nums.length];
        int result = nums[0];
        max[0] = nums[0];
        min[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {

            max[i] = Math.max(nums[i] >= 0 ? max[i - 1] * nums[i] : min[i - 1] * nums[i], nums[i]);
            min[i] = Math.min(nums[i] < 0 ? max[i - 1] * nums[i] : min[i - 1] * nums[i], nums[i]);
            result = Math.max(result, max[i]);

        }
        for (int i = 0; i < max.length; i++) {

            System.err.print(max[i] + ",");
        }
        System.err.println();
        for (int i = 0; i < max.length; i++) {
            System.err.print(min[i] + ",");
        }
        System.err.println();
        return result;


    }


    /**
     * 递归
     *
     * @param nums
     * @param i
     * @param product
     */
    public void recursion(int[] nums, int i, int product) {

        if (i >= nums.length) {
            return;
        }

        int thisProduct = product * nums[i];
        maxProduct = Math.max(thisProduct, maxProduct);
        recursion(nums, i + 1, thisProduct);
        recursion(nums, i + 1, 1);
    }

    public static void main(String[] args) {
        System.err.println(new SolutionMaxProduct152().maxProduct(new int[]{2, 3, -1, -2, -5, 4}));
//        System.err.println(new SolutionMaxProduct152().maxProduct(new int[]{-1, 0, -2}));
    }

}
