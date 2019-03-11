package leetcode.tree;

public class SolutionIsUnivalTree965 {


    private static int DEFALUT_V = -1;
    int v = DEFALUT_V;

    public boolean isUnivalTree(TreeNode root) {


        if (root == null) {
            return true;
        }

        if (v == DEFALUT_V) {
            v = root.val;
        } else if (v != root.val) {
            return false;
        }

        return isUnivalTree(root.left) && isUnivalTree(root.right);


    }
}
