package leetcode;

public class SolutionIsPowerOfTwo231 {


//    给定一个整数，编写一个函数来判断它是否是 2 的幂次方。

//    示例 1:
//
//    输入: 1
//    输出: true
//    解释: 20 = 1
//    示例 2:
//
//    输入: 16
//    输出: true
//    解释: 24 = 16
//    示例 3:
//
//    输入: 218
//    输出: false


    public static void main(String[] args) {
        System.err.println(new SolutionIsPowerOfTwo231().isPowerOfTwo(-2147483648));

    }

    public boolean isPowerOfTwo(int n) {


        return n == 0 || n == Integer.MIN_VALUE ? false : (n & (n - 1)) == 0;

    }


}
