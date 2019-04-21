package leetcode.interview;

public class GeekSolutionJump45 {


    public int dpJump(int[] a) {


        int[] dp = new int[a.length];

        dp[0] = 0;
        for (int i = 1; i < a.length; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (i - j <= a[j]) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[a.length - 1];
    }


    public int jump(int[] a) {

        int jumpTimes = 0;
        int maxPosition = 0;
        int reached = 0;
        for (int i = 0; i < a.length; i++) {
            if (reached < i) {
                jumpTimes++;
                reached = maxPosition;
            }
            maxPosition = Math.max(maxPosition, i + a[i]);
        }
        return jumpTimes;
    }


}
