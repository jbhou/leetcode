package leetcode.linkedlist;

public class SolutionCoinChange322 {
    public static void main(String[] args) {

        System.err.println(new SolutionCoinChange322().coinChange(new int[]{1, 2, 5}, 11));


    }


    public int coinChange(int[] coins, int amount) {


        int[] dp = new int[amount + 1];

        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 1;
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i)
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
