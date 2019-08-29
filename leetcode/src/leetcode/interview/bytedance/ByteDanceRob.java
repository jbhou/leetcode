package leetcode.interview.bytedance;

public class ByteDanceRob {


    public int rob(int[] nums) {


        int []dp = new int[nums.length];

        dp[0]=nums[0];
        dp[1]=nums[0]>nums[1]?nums[0]:nums[1];

        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(dp[i-2]+dp[i],dp[i-1]);
        }
        return dp[nums.length-1];

    }
}
