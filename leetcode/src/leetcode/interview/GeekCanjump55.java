package leetcode.interview;

public class GeekCanjump55 {

    public static void main(String[] args) {


        System.err.println(new GeekCanjump55().canJump(new int[]{1, 1, 1, 0}));


    }


    public boolean canJump(int[] nums) {
        int needLength = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= needLength) {
                needLength = 1;
            } else {
                needLength++;
            }
            if (i == 0 && needLength > 1) {
                return false;
            }
        }
        return true;

    }


    /**
     * 递归超时
     *
     * @param nums
     * @return
     */
    public boolean canJump2(int[] nums) {


        return jumpTo(nums, 0, 0);


    }

    private boolean jumpTo(int[] nums, int currIndex, int pre) {

        if (currIndex >= nums.length - 1) {
            return true;
        }

        boolean can = false;
        for (int i = pre + 1; i <= nums[currIndex]; i++) {

            can = can || jumpTo(nums, currIndex + i, pre);
            if (can) {
                break;
            }
        }


        return can;


    }
}
