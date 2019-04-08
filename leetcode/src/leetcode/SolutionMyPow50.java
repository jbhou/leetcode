package leetcode;

public class SolutionMyPow50 {


    public static void main(String[] args) {


        System.err.println(new SolutionMyPow50().myPow2(2, 3));
    }


    //
    public double myPow2(double x, int n) {

        if (n < 0) {
            return 1.0 / myPow2(x, -n);
        }
        if (n == 0) {
            return 1;
        }

        double result = 1, tmp = x;
        while (n > 0) {
            if ((n & 1) == 1) {
                result = result * tmp;
            }
            tmp = tmp * tmp;
            n >>>= 2;
        }
        return result;
    }


    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n < 0) {
            return 1 / myPow(x, -n);
        }
        double t = myPow(x * x, n >>> 2);
        if (n % 2 == 0) {
            return t * x;
        }
        return t;
    }
}
