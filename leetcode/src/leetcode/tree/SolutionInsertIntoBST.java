package leetcode.tree;

import sun.reflect.generics.tree.Tree;

public class SolutionInsertIntoBST {


    public TreeNode insertIntoBST(TreeNode root, int val) {


        TreeNode newNode = new TreeNode(val);
        if (root == null) {
            return newNode;
        }

        TreeNode cur = root;

        while (cur != null) {

            if (val > cur.val) {
                if (cur.right == null) {
                    cur.right = newNode;
                    break;
                }
                cur = cur.right;
            } else {

                if (cur.left == null) {
                    cur.left = newNode;
                    break;
                }

                cur = cur.left;
            }

        }


        return root;

    }
}
