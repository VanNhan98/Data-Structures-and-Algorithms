public class _104_maximum_depth_of_binary_tree {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        // ham de quy
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
}
