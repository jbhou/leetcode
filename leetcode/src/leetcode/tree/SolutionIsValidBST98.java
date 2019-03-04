package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class SolutionIsValidBST98 {


    public boolean isValidateBSTRecursion(TreeNode root) {

        return validate(root, null, null);

    }


    public boolean validate(TreeNode root, Integer min, Integer max) {


        if (root == null) {
            return true;
        }
        if ((min != null && root.val < min) || (max != null && root.val > max)) return false;

        return validate(root.left, min, root.val) && validate(root.right, root.val, max);

    }


    /**
     * 先中序遍历,再判断数组的顺序
     *
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {


        if (root == null) {
            return true;
        }

        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        if (list.size() == 1) {
            return true;
        }


        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) {
                return false;
            }
        }

        return true;


    }

    private void inOrder(TreeNode root, List<Integer> list) {

        if (root != null) {


            inOrder(root.left, list);
            list.add(root.val);
            inOrder(root.right, list);


        }


    }
}
