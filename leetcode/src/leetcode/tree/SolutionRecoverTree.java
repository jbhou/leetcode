package leetcode.tree;

/**
 * @author ：houjinbiao
 * @date ：Created in 2021/5/15 12:27
 * @description： 一个BST 中，某两个节点位置被对调，需要找到这两个点并恢复BST
 * @version: 1.0
 */
public class SolutionRecoverTree {


    TreeNode t1;
    TreeNode t2;
    TreeNode pre;


    public void recoverTree(TreeNode root) {


        if (root == null) {
            return;
        }


        inOrder(root);
        int tmp = t1.val;
        t1.val = t2.val;
        t2.val = tmp;


    }

    private void inOrder(TreeNode current) {


        if (current == null) return;

        inOrder(current.left);

        if (pre != null && pre.val > current.val) {
            if (t1 == null) t1 = current;
            t2 = current;
        }
        pre = current;

        inOrder(current.right);

    }


    public void inOrder2(TreeNode root) {

        if (root == null) {
            return;
        }

        inOrder2(root.left);

        if (pre != null && pre.val > root.val) {
            if (t1 == null) t1 = root;
            t2 = root;
        }
        pre = root;


        inOrder2(root.right);


    }


}
