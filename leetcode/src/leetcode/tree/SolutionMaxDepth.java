package leetcode.tree;

public class SolutionMaxDepth {


    public int maxDepth(TreeNode root) {


        if (root == null) {
            return 0;
        }
        if (root.right == null && root.left == null) {
            return 1;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        int maxDepth = leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
        return maxDepth;

    }
}
