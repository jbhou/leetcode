package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SOlutionChange518 {


    public static void main(String[] args) {

        System.err.println(new SOlutionChange518().change(5, new int[]{1, 2, 5}));


    }


    public int change(int amount, int[] coins) {


        if (coins.length == 0) {
            return amount != 0 ? 0 : 1;
        }

        int[] dp = new int[amount + 1];
        dp[0] = 1;


        /// dp[i] 是金额为i的组合数量,

        for (int i = 0; i < coins.length; i++) {

            for (int j = coins[i]; j <= amount; j++) {
                dp[j] += dp[j - coins[i]];
            }

        }


        return dp[amount];

//        Set<List<Integer>> set = new HashSet<>();
//        recursion(coins, amount, 0, new ArrayList<Integer>(), set);
//        return set.size();
    }


    /**
     * 递归,超时
     *
     * @param coins
     * @param amount
     * @param start
     * @param list
     * @param set
     */
    private void recursion(int[] coins, int amount, int start, ArrayList<Integer> list, Set<List<Integer>> set) {


        if (amount == 0) {
            set.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < coins.length && amount > 0; i++) {

            list.add(coins[i]);
            recursion(coins, amount - coins[i], i, list, set);
            list.remove(list.size() - 1);

        }


    }


}
