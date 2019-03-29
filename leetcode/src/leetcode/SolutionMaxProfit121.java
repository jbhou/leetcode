package leetcode;

public class SolutionMaxProfit121 {


    public static void main(String[] args) {
        System.err.println(new SolutionMaxProfit121().maxProfit(new int[]{8, 2, 5, 4, 3, 6, 1, 9}));
    }

    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }


        int result = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {

            buy = Math.min(buy, prices[i]);
            result = Math.max(result, prices[i] - buy);
        }
        return result;


    }


}
