package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SolutionLengthOfLIS300 {


    public static void main(String[] args) {
        int[] a = new int[]{10, 9, 2, 5, 3, 7, 101, 18};

        System.err.println(new SolutionLengthOfLIS300().lengthOfLIS(a));


    }


    public int lengthOfLIS(int[] a) {


        return byMidSearch(a);

//        return dp(a);


    }


    private int findFirstLarge(List<Integer> list, int target) {

        if (list.isEmpty()) {
            return -1;
        }

        int start = 0;
        int end = list.size() - 1;
        while (start <= end) {
            int mid = start + ((end - start) >> 1);
            if (list.get(mid) >= target && (mid == 0 || mid == list.size() - 1 || list.get(mid - 1) < target)) {
                return mid;
            }
            if (list.get(mid) > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    /**
     * N log(N)
     *
     * @param a
     * @return
     */
    private int byMidSearch(int[] a) {


        List<Integer> list = new ArrayList<>(a.length);

        for (int i = 0; i < a.length; i++) {

            int v = a[i];
            int replaceIndex = findFirstLarge(list, v);
            if (replaceIndex == -1) {
                list.add(v);
            } else {
                list.set(replaceIndex, v);
            }

        }
        return list.size();
    }

    private int dp(int[] a) {

        int[] dp = new int[a.length];
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i]) {
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max + 1;
            result = Math.max(dp[i], result);
        }
        return result;
    }


}
