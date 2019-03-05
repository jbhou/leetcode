package leetcode.search;

import org.omg.PortableInterceptor.INACTIVE;

public class SolutionMyPow50 {


    public static void main(String[] args) {


//        System.err.println(myPow(2, Integer.MIN_VALUE + 1));

        System.err.println(-Integer.MIN_VALUE);
//        System.err.println(myPowDivideConquer(1, Integer.MIN_VALUE));


    }


    public static double myPowDivideConquer(double x, int n) {


        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n < 0) {
            return 1 / myPowDivideConquer(x, -n);
        }
        if (n % 2 == 0) {
            return myPowDivideConquer(x, n - 1);
        }
        return myPowDivideConquer(x * x, n / 2);


    }


    /**
     * 二分搜索
     *
     * @param x
     * @param n
     * @return
     */

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        } else {
            if (n > 0) {
                return pow(x, n);
            } else {
                return 1 / pow(x, -n);
            }
        }
    }

    /**
     * 是无符号移位
     *
     * @param x
     * @param n
     * @return
     */
    public static double pow(double x, int n) {
        if (n == 1) {
            return x;
        } else {
            double half = pow(x, n >>> 1);
            if (n % 2 == 0) {
                return half * half;
            } else {
                return half * half * x;
            }
        }
    }


    /**
     * 递归解法
     *
     * @param x
     * @param n
     * @return
     */

    public static double myPow2(double x, int n) {

        if (x == 0) return 0;
        if (n == 0) return 1;
        if (n < 0) return 1.0 / myPow2(x, -n);

        return x * myPow2(x, n - 1);


    }

}

