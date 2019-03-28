package leetcode;

public class SolutionMaxSubArray53 {


    public static void main(String[] args) {

        System.err.println(new SolutionMaxSubArray53().maxSubArray(new int[]{1, 2, 4, 3, -3, -6, 5, 3, 7}));
    }


    public int maxSubArray(int[] a) {


//        recursion(a, 0, 0);
//        return max;


        return dp(a);
    }

    private int dp(int[] a) {


            int res = a[0];
            int sum = 0;
            for (int num : a) {
                if (sum > 0)
                    sum += num;
                else
                    sum = num;
                res = Math.max(res, sum);
            }
            return res;



//        int[] dp = new int[a.length];
//
//        int result = Integer.MIN_VALUE;
//        for (int i = 0; i < a.length; i++) {
//        if(a[i]>0){
//
//        }
//
//            result = Math.max(result, dp[i]);
//        }


    }

    int max = Integer.MIN_VALUE;

    public void recursion(int[] a, int index, int tmpsum) {


        if (index >= a.length) return;

        int sum = tmpsum + a[index];
        if (sum > max) max = sum;
        recursion(a, index + 1, sum);
        recursion(a, index + 1, 0);


    }


}
