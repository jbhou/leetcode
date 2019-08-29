package leetcode.tree;

import leetcode.linkedlist.ListNode;
import sun.reflect.generics.tree.Tree;

import java.util.*;

public class SolutionLevelOrder102 {

    /**
     * BFS 广度优先搜索
     *
     * @param root
     * @return
     */

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> list = new ArrayList<Integer>();
            while (count > 0) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
                count--;
            }
            res.add(list);
        }
        return res;
    }


    /**
     * 深度优先搜索处理
     *
     * @param root
     * @return
     */
    public List<List<Integer>> leverOrderDFS(TreeNode root) {


        List<List<Integer>> result = new ArrayList<>();

        dfs(result, root, 0 + 1);

        return result;
    }

    private void dfs(List<List<Integer>> result, TreeNode root, int level) {

        if (root == null) {
            return;
        }

        if (result.size() < level) {
            result.add(new ArrayList<>());
        }
        result.get(level - 1).add(root.val);
        dfs(result, root.left, level + 1);
        dfs(result, root.right, level + 1);
    }


    public List<List<Integer>> levelBFS(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int qsize = queue.size();

            for (int i = 0; i < qsize; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    list.add(node.val);
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
                result.add(list);
            }
        }
        return result;
    }


    public List<List<Integer>> levelDFS(TreeNode root) {


        List<List<Integer>> result = new ArrayList<>();

        levelDFS(root, result, 1);
        return result;

    }

    private void levelDFS(TreeNode root, List<List<Integer>> result, int level) {
        if (root == null) return;
        if (result.size() < level) {
            result.add(new ArrayList<>());
        }

        result.get(level - 1).add(root.val);
        levelDFS(root.left, result, level + 1);
        levelDFS(root.right, result, level + 1);


    }


}
