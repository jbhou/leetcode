package leetcode;

public class SolutionClimbStairs70 {


    public static void main(String[] args) {

        System.err.println(new SolutionClimbStairs70().climbStairs(5));


    }

    public int climbStairs(int n) {

        int[] cache = new int[n + 1];
        return climbStairs(n, cache);

    }


    public int climbStairs(int n, int[] cache) {

        if (cache[n] != 0) {
            return cache[n];
        }

        if (n <= 2) {
            cache[n] = n;
            return cache[n];
        }

        cache[n] = climbStairs(n - 1, cache) + climbStairs(n - 2, cache);
        return cache[n];
    }

}
