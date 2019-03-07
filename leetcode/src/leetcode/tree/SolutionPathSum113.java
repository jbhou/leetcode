package leetcode.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionPathSum113 {


    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        List<List<Integer>> result = new ArrayList<>();


        if (root == null) {
            return result;
        }

        pathSumRecursion(root, sum, new ArrayList<>(),result);
        return result;
    }

    private void pathSumRecursion(TreeNode root, int sum, List<Integer> apath, List<List<Integer>> paths) {

        if (root == null) {
            return;
        }
        apath.add(root.val);
        if (root.right == null && root.left == null && sum - root.val == 0) {
            List<Integer> path = new ArrayList<>(apath);
            paths.add(path);
        } else {
            pathSumRecursion(root.left, sum - root.val, apath, paths);
            pathSumRecursion(root.right, sum - root.val, apath, paths);
        }

        apath.remove(apath.size() - 1);

    }

}


class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ansList = new ArrayList<>();
        if (root == null) return ansList;
        List<Integer> curList = new ArrayList<>();

        findPath(root, sum, curList, ansList);

        return ansList;
    }

    private void findPath(TreeNode root, int sum, List<Integer> curList, List<List<Integer>> ansList) {
        if (root == null) return;
        curList.add(root.val);
        if (root.left == null && root.right == null && sum == root.val) {
            List<Integer> tmp = new ArrayList<>(curList);
            ansList.add(tmp);
        } else {
            findPath(root.left, sum - root.val, curList, ansList);
            findPath(root.right, sum - root.val, curList, ansList);
        }
        curList.remove(curList.size() - 1);
    }
}
