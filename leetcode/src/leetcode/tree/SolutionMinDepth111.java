package leetcode.tree;

public class SolutionMinDepth111 {


    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        return leftDepth == 0 || rightDepth == 0 ? leftDepth + rightDepth + 1 : Math.min(leftDepth, rightDepth) + 1;


    }


}
