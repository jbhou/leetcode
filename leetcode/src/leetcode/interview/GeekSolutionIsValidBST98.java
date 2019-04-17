package leetcode.interview;

import leetcode.tree.TreeNode;

public class GeekSolutionIsValidBST98 {


    private TreeNode preNode;


    public boolean isValidBST2(TreeNode root) {


        return inOrderValid(root);
    }

    private boolean inOrderValid(TreeNode root) {

        if (root == null) {
            return true;
        }
        if (!inOrderValid(root.left)) {
            return false;
        }
        if (preNode != null && root.val <= preNode.val) {
            return false;
        }
        preNode = root;
        return inOrderValid(root.right);
    }


    /**
     * 递归
     *
     * @param root
     * @return
     */

    public boolean isValidBST(TreeNode root) {

        return validate(root, null, null);

    }


    private boolean validate(TreeNode root, Integer min, Integer max) {


        if (root == null) {
            return true;
        }

        if ((min != null && min > root.val) || (max != null && max < root.val)) return false;
        return validate(root.left, min, root.val) && validate(root.right, root.val, max);

    }
}
