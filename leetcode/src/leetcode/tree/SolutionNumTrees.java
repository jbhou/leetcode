package leetcode.tree;

/**
 * @author ：houjinbiao
 * @date ：Created in 2021/5/15 11:19
 * @description：
 * @version: 1.0
 */
public class SolutionNumTrees {


//动态规划
//
//假设n个节点存在二叉排序树的个数是G(n)，令f(i)为以i为根的二叉搜索树的个数
//
//即有:G(n) = f(1) + f(2) + f(3) + f(4) + ... + f(n)
//
//n为根节点，当i为根节点时，其左子树节点个数为[1,2,3,...,i-1]，
// 右子树节点个数为[i+1,i+2,...n]，所以当i为根节点时，其左子树节点个数为i-1个，右子树节点为n-i，即f(i) = G(i-1)*G(n-i),
//
//上面两式可得:G(n) = G(0)*G(n-1)+G(1)*(n-2)+...+G(n-1)*G(0)

    //    结题思路：假设n个节点存在二叉排序树的个数是G(n)，1为根节点，2为根节点，...，n为根节点
//    当1为根节点时，其左子树节点个数为0，右子树节点个数为n-1，同理当2为根节点时，其左子树节点个数为1，
//    右子树节点为n-2，所以可得G(n) = G(0)*G(n-1)+G(1)*(n-2)+...+G(n-1)*G(0)
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[0] = 1;
        //dp[2] = 2;
        for (int i = 2; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }


    public int numTrees2(int n) {

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }

        return dp[n];
    }


}
