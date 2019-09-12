package leetcode.search;

public class SolutionIsPerfectSquare {


    public static void main(String[] args) {
        System.err.println(isPerfectSquare3(808201));


    }

    public static boolean isPerfectSquare(int num) {
        if (num == 1 || num == 0) {
            return true;
        }

        int i = 1;
        while (i <= num / 2) {
            if (i * i == num) {
                System.err.println(i);
                return true;
            }
            i++;
        }
        return false;
    }


    public static boolean isPerfectSquare3(int num) {
        if (num == 1 || num == 0) {
            return true;
        }

        int low = 1;
        int high = num / 2;


        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (mid * mid == num) {
                return true;
            }
            if (mid * mid > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;

    }


    public static boolean isPerfectSquare2(int num) {
        if (num == 1 || num == 0) {
            return true;
        }

        int l = 1, r = num / 2;
        while (l <= r) {
            int mid = l + ((r - l) / 2);
            int square = mid * mid;
            if (square == num) return true;
            if (square > num) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }


}









