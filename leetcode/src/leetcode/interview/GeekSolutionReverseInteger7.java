package leetcode.interview;

public class GeekSolutionReverseInteger7 {

    /**
     * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
     * <p>
     * 示例 1:
     * <p>
     * 输入: 123
     * 输出: 321
     * 示例 2:
     * <p>
     * 输入: -123
     * 输出: -321
     * 示例 3:
     * <p>
     * 输入: 120
     * 输出: 21
     * 注意:
     * <p>
     * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
     */


    public int reverse(int x) {
        if (x < 0) {
            return x == Integer.MIN_VALUE ? 0 : -reverse(-x);
        }

        int res = 0;
        while (x > 0) {
            int i = x % 10;
            if (res > Integer.MAX_VALUE / 10 || res == Integer.MAX_VALUE / 10 && i > Integer.MAX_VALUE % 10) {
                return 0;
            }

            res = res * 10 + i;

            x = x / 10;
        }
        return res;
    }


    public static void main(String[] args) {
        System.err.println(new GeekSolutionReverseInteger7().reverse(-2143847412));
    }


}
