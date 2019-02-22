package leetcode.tree;

public class SolutionIsSameTree {


    public boolean isSameTree(TreeNode p, TreeNode q) {


        if ((p != null && q == null) || (q != null && p == null)) {
            return false;
        }

        if (!isSameNode(p, q)) {
            return false;
        }
        if (p != null && q != null) {
            if (!isSameTree(p.left, q.left)) {
                return false;
            }
        }
        if (p != null && q != null) {
            if (!isSameTree(p.right, q.right)) {
                return false;
            }
        }
        return true;
    }

    private boolean isSameNode(TreeNode p, TreeNode q) {

        if (p == q) {
            return true;
        }
        if ((q == null && p != null) || (p == null && q != null)) {
            return false;
        }
        if (p == null && q == null) {
            return true;
        }
        return q.val == p.val;


    }


}
