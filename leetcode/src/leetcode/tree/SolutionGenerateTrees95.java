package leetcode.tree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class SolutionGenerateTrees95 {


    public static void main(String[] args) {
        System.err.println(new SolutionGenerateTrees95().generateTrees(3));
    }



    public List<TreeNode> generateTrees(int n) {


        return n == 0 ? new ArrayList<>() : generateTrees(1, n);

    }


    public List<TreeNode> generateTrees(int start, int end) {

        List<TreeNode> res = new ArrayList<>();
        if (start > end) {
            res.add(null);
            return res;
        }
        for (int i = start; i <= end; i++) {

            List<TreeNode> leftSubTree = generateTrees(start, i-1);
            List<TreeNode> rightSubTree = generateTrees(1 + i, end);

            for (TreeNode left : leftSubTree) {
                for (TreeNode right : rightSubTree) {
                    TreeNode treeNode = new TreeNode(i);
                    treeNode.left = left;
                    treeNode.right = right;
                    res.add(treeNode);
                }

            }
        }
        return res;

    }


}
