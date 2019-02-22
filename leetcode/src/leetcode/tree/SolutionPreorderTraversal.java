package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class SolutionPreorderTraversal {


    public List<Integer> preorderTraversal(TreeNode root) {


        List<Integer> list = new ArrayList<>();

        preorderTraversal(root, list);
        return list;
    }

    private void preorderTraversal(TreeNode root, List<Integer> list) {

        if (root != null) {
            list.add(root.val);
            preorderTraversal(root.left, list);
            preorderTraversal(root.right, list);

        }


    }
}