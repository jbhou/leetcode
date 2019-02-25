package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class SolutionBinaryTreePaths {


    public List<String> binaryTreePaths(TreeNode root) {

        List<String> list = new ArrayList<>();

        if (root == null) {
            return list;
        }
        if (root.left == null && root.right == null) {
            list.add(root.val + "");
        } else {
            findPath(root.left, root.val + "", list);
            findPath(root.right, root.val + "", list);
        }
        return list;

    }

    private void findPath(TreeNode node, String s, List<String> list) {
        if (node == null) {
            return;
        }
        String curPath = s + "->" + node.val;
        if (node.left == null && node.right == null) {
            list.add(curPath);
        } else {

            findPath(node.left, curPath, list);
            findPath(node.right, curPath, list);
        }


    }

}