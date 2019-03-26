package leetcode;

public class SolutionClimbStairs70 {


    public static void main(String[] args) {

        System.err.println(new SolutionClimbStairs70().climbStairs(5));


    }

    //冬天规划
    public int climbStairs(int n) {


        if (n <= 2) return n;

        int x = 1;
        int y = 2;
        int z = 0;
        for (int i = 2; i < n; i++) {

            z = x + y;
            x = y;
            y = z;
        }
        return z;

//        int[] cache = new int[n + 1];
//        return climbStairs(n, cache);

    }


    /**
     * 递归回溯
     *
     * @param n
     * @param cache
     * @return
     */

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
