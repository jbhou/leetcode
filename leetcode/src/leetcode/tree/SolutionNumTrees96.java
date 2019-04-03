package leetcode.tree;

public class SolutionNumTrees96 {


    public static void main(String[] args) {


        System.err.println(new SolutionNumTrees96().numTrees(3));

    }
//    给定一个整数 n，求以 1 ... n 为节点组成的二叉搜索树有多少种？
//
//    示例:
//
//    输入: 3
//    输出: 5
//    解释:
//    给定 n = 3, 一共有 5 种不同结构的二叉搜索树:
//
//            1         3     3      2      1
//            \       /     /      / \      \
//            3     2     1      1   3      2
//            /     /       \                 \
//            2     1         2                 3


//    解法:
//    动态规划 假如  G(n) 为n个节点的二叉搜索树的数量,F(i) 为当 i 为根节点时二叉搜索树的数量
//    则: G(n) = F(1) + F(2) + F(3) +...+F(n)
//        当i为根节点时  左子树有(i-1)个节点,右子树有(n-i)个节点
//    所以:F(i) = G(i-1) + G(n-i)
//    所以:G(n) = G(0)*G(n-1) * G(i)*G(n-2) + ... + G(n-1)*G(0)

    public int numTrees(int n) {


        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;


        for (int i = 2; i < n + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                dp[i] += dp[j - 1] * dp[i - j];

            }
        }

        return dp[n];

    }


}
