package leetcode;

public class SoluationdivideTwoIntegers {

    public int divide(int dividend, int divisor) {


        if (dividend < 0 && dividend != dividend * -1) return -1 * divide(-1 * dividend, divisor);
        if (divisor < 0 && divisor != divisor * -1) return -1 * divide(dividend, -1 * divisor);


        int result = 0;
        int a = divisor;
        while (a <= dividend) {
            result++;
            a += divisor;
        }
        return result;

    }

    public static void main(String[] args) {

        int d = new SoluationdivideTwoIntegers().divide(-200, 2);
        System.err.println(d);
    }
}
