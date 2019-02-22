package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class SolutionInorderTraversal {


    public List<Integer> inorderTraversal(TreeNode root) {


        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }
        inorderTraversal(root, list);
        return list;


    }

    private void inorderTraversal(TreeNode root, List<Integer> list) {

        if (root != null) {
            inorderTraversal(root.left, list);
            list.add(root.val);
            inorderTraversal(root.right, list);
        }


    }


}
