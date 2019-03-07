package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class SolutionHasPathSum112 {


//    public boolean hasPathSum(TreeNode root, int sum) {
//
//
//        if (root == null) {
//            return false;
//        }
//
//        List<String> paths = new ArrayList<>();
//        hasPathSumRecursion(root, 0, sum, "", paths);
//        return paths.size() > 0;
//
//    }
//
//    private void hasPathSumRecursion(TreeNode root, int tmp, int sum, String pre, List<String> paths) {
//
//        if (root.right == null && root.left == null && tmp + root.val == sum) {
//            paths.add(pre + "->" + root.val);
//            return;
//        }
//
//        if (root.left != null) {
//            hasPathSumRecursion(root.left, tmp + root.val, sum, pre + "->", paths);
//        }
//
//        if (root.right != null) {
//            hasPathSumRecursion(root.right, tmp + root.val, sum, pre + "->", paths);
//        }
//
//    }


    public boolean hasPathSum(TreeNode root, int sum) {


        if (root == null) {
            return false;
        }

        return hasPathSumRecursion(root, 0, sum);

    }

    private boolean hasPathSumRecursion(TreeNode root, int tmp, int sum) {

        if (root == null) {
            return false;
        }

        if (root.right == null && root.left == null) {
            return tmp + root.val == sum;
        }

        return hasPathSumRecursion(root.left, tmp + root.val, sum) ||
                hasPathSumRecursion(root.right, tmp + root.val, sum);

    }
}
