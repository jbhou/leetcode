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


    public TreeNode insertIntoBST2(TreeNode root, int val) {


        TreeNode treeNode = new TreeNode(val);
        if (root == null) {
            return treeNode;
        }

        TreeNode cur = root;
        while (cur != null) {
            if (val < cur.val) {
                if (cur.left != null) {
                    cur = cur.left;
                } else {
                    cur.left = treeNode;
                }

            } else {
                if (cur.right == null) {
                    cur.right = treeNode;
                } else {
                    cur = cur.right;
                }
            }
        }

        return root;

    }


}
