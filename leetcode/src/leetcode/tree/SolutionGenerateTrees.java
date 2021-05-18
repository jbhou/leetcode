package leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：houjinbiao
 * @date ：Created in 2021/5/15 11:10
 * @description：https://leetcode-cn.com/problems/unique-binary-search-trees-ii/
 * @version: 1.0
 */
public class SolutionGenerateTrees {


    public static void main(String[] args) {

    }

    public List<TreeNode> generateTrees(int n) {
        if (n == 0)
            return new LinkedList<TreeNode>();
        return generateTrees(1, n);
    }


    public List<TreeNode> generateTrees(int start, int end) {

        List<TreeNode> ret = new ArrayList<>();

        if (start > end) {
            ret.add(null);
            return ret;
        }

        for (int i = start; i < end; i++) {
            List<TreeNode> subLeftTree = generateTrees(start, i - 1);
            List<TreeNode> suRightTree = generateTrees(i + 1, end);
            for (TreeNode left : subLeftTree) {
                for (TreeNode right : suRightTree) {

                    TreeNode node = new TreeNode(i);
                    node.left = left;
                    node.right = right;
                    ret.add(node);
                }
            }
        }
        return ret;


    }


}
