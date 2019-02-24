package leetcode.tree;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class SolutionLevelOrderBottom {


    public static void main(String[] args) {


        TreeNode r = new TreeNode(3);
        r.left = new TreeNode(9);
        r.right = new TreeNode(20);
        r.right.left = new TreeNode(15);
        r.right.right = new TreeNode(7);


        System.err.println(new SolutionLevelOrderBottom().levelOrderBottom(r));


    }


    public List<List<Integer>> levelOrderBottom(TreeNode root) {


        List<List<Integer>> list = new ArrayList<>();


        if (root == null) {
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            int count = queue.size();
            List<Integer> l = new ArrayList<>();
            list.add(l);
            while (count > 0) {
                TreeNode node = queue.poll();
                l.add(node.val);
                count--;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        Collections.reverse(list);
        return list;
    }
}
