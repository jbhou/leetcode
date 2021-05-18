package leetcode.tree;

public class SolutionisBalanced110 {


    public boolean isBalanced(TreeNode root) {


        if (root == null) {
            return true;
        }
        if (Math.abs(maxDepth(root.left) - maxDepth(root.right)) > 1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }

    }

    public int maxDepth(TreeNode node) {

        if (node == null) {
            return 0;
        }

        int left = maxDepth(node.left);
        int right = maxDepth(node.right);
        return Math.max(left, right) + 1;
    }


    public int maxDepth2(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = maxDepth2(node.left);
        int right = maxDepth2(node.right);
        return (left > right ? left : right) + 1;

    }


}
