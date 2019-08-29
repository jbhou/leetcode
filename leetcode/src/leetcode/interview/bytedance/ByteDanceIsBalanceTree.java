package leetcode.interview.bytedance;

import leetcode.tree.TreeNode;

public class ByteDanceIsBalanceTree {


//    给定一个二叉树，判断它是否是高度平衡的二叉树。
//
//    本题中，一棵高度平衡二叉树定义为：
//
//    一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。

    public boolean isBalanced(TreeNode root) {

        if(root==null)return true;
      if(Math.abs(maxDepth(root.left) - maxDepth(root.right))>1){
          return false;
      }
      return isBalanced(root.left) && isBalanced(root.right);

    }


    public int maxDepth(TreeNode root){

        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth= maxDepth(root.right);

        return leftDepth>rightDepth?leftDepth+1:rightDepth+1;







    }



}
