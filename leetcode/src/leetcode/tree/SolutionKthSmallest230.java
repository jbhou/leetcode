package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class SolutionKthSmallest230 {


    public int kthSmallest(TreeNode root, int k) {
        findKthSmallest(root, k);
        return v;

    }

    int visited = 0;
    int v = 0;


    public void findKthSmallest(TreeNode node, int k) {

        if (node != null) {

            findKthSmallest(node.left, k);
            visited++;
            v = node.val;
            if (visited == k) {
                return;
            }

            findKthSmallest(node.right, k);

        }

    }


}
