package leetcode;

import leetcode.tree.TreeNode;

public class SolutionIsSymmetric {


    public static void main(String[] args) {


    }


    public boolean isSymmetric(TreeNode root) {


        if (root == null) {
            return true;
        }

        return isSymmetric(root.left, root.right);

    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {


        if (left == null) {
            return null == right;
        }
        if (right == null) {
            return null == left;
        }


        if (left.val == right.val) {
            return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
        }
        return false;
    }


}
