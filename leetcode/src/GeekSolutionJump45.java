public class GeekSolutionJump45 {


    public static void main(String[] args) {


        int m = new GeekSolutionJump45().jumpByDP(new int[]{2, 3, 1, 1, 4});
        System.err.println(m);

    }


    int min = Integer.MAX_VALUE;

    //https://blog.csdn.net/MebiuW/article/details/51171153
    public int jump(int[] a) {


        int times = 0;
        int reached = 0;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (reached < i) {
                times++;
                reached = max;
            }
            max = Math.max(max, i + a[i]);
        }
        return times;
    }


    /**
     * DP
     *
     * @param a
     * @return
     */
    public int jumpByDP(int[] a) {

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


    /**
     * 超时
     *
     * @param a
     * @param currentIndex
     * @param preStep
     * @param totalSteps
     */
    private void jumpTo(int[] a, int currentIndex, int preStep, int totalSteps) {


        if (currentIndex >= a.length - 1) {
            min = min > totalSteps ? totalSteps : min;
            return;
        }

        for (int i = preStep + 1; i <= a[currentIndex]; i++) {
            jumpTo(a, currentIndex + i, preStep, totalSteps + 1);
        }


    }


}
