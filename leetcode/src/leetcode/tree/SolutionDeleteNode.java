package leetcode.tree;

public class SolutionDeleteNode {


    public TreeNode deleteNode(TreeNode root, int data) {

        if (root == null ) {
            return null;
        }

        TreeNode targetNode = root; // p 指向要删除的节点，初始化指向根节点
        TreeNode targetParentNode = null; // pp 记录的是 p 的父节点
        while (targetNode != null && targetNode.val != data) {
            targetParentNode = targetNode;
            if (data > targetNode.val) targetNode = targetNode.right;
            else targetNode = targetNode.left;
        }
        if (targetNode == null) return root; // 没有找到

        // 要删除的节点有两个子节点
        if (targetNode.left != null && targetNode.right != null) { // 查找右子树中最小节点
            TreeNode minNode = targetNode.right;
            TreeNode minNodeParent = targetNode; // minPP 表示 minP 的父节点
            while (minNode.left != null) {
                minNodeParent = minNode;
                minNode = minNode.left;
            }
            targetNode.val = minNode.val; // 将 minP 的数据替换到 p 中
            targetNode = minNode; // 下面就变成了删除 minP 了
            targetParentNode = minNodeParent;
        }

        // 删除节点是叶子节点或者仅有一个子节点
        TreeNode child; // p 的子节点
        if (targetNode.left != null) child = targetNode.left;
        else if (targetNode.right != null) child = targetNode.right;
        else child = null;

        if (targetParentNode == null) return child; // 删除的是根节点
        else if (targetParentNode.left == targetNode) targetParentNode.left = child;
        else targetParentNode.right = child;

        return root;
    }
}
