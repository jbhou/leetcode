package leetcode.search;


/**
 * 二分求x的平方根
 */
public class SolutionMySqrt {


    public static void main(String[] args) {

        int x = 2147395599;
        int s = mySqrt(x);

        System.err.println(s);
    }


    public static int mySqrt(int x) {

        if (x <= 1) return x;
        int low = 0;
        int high = x;

        while (low < high) {
            int mid = low + ((high - low) >> 1);
            if (x / mid == mid) {
                return mid;
            }
            if (x / mid < mid) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return high - 1;
    }



}
