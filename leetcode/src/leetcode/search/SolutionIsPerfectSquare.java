package leetcode.search;

public class SolutionIsPerfectSquare {


    public static void main(String[] args) {
        System.err.println(isPerfectSquare(808201));


    }

    public static boolean isPerfectSquare(int num) {


        if (num == 1 || num == 0) {
            return true;
        }

        int i = 1;
        while (i <= num / 2) {
            if (i * i == num) {
                return true;
            }
            i++;
        }
        return false;


    }
}
