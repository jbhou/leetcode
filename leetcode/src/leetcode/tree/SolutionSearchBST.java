package leetcode.tree;

public class SolutionSearchBST {


    public TreeNode searchBST(TreeNode root, int val) {


        if (root == null) {
            return null;
        }

        TreeNode cur = root;
        do {

            if (cur.val == val) {
                return cur;
            }
            if (cur.val < val) {
                cur = cur.right;
            } else {
                cur = cur.left;
            }

        } while (cur != null);

        return null;


    }


}
