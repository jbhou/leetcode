package leetcode.interview;

import leetcode.tree.TreeNode;
import org.omg.PortableInterceptor.INACTIVE;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GeekSolutionLevelOrder102 {


    /**
     * 数组填充法
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder2(TreeNode root) {


        List<List<Integer>> result = new ArrayList<>();
        dfs(result, root, 1);
        return result;
    }


    public void dfs(List<List<Integer>> result, TreeNode node, int level) {
        if (node == null) return;
        if (result.size() < level) {
            result.add(new ArrayList<>());
        }

        result.get(level - 1).add(node.val);
        dfs(result, node.left, level + 1);
        dfs(result, node.right, level + 1);
    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node == null) continue;
                list.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            result.add(list);
        }
        return result;
    }


}
