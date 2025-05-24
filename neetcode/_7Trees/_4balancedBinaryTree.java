package neetcode._7Trees;

@SuppressWarnings("unused")
public class _4balancedBinaryTree {
    private boolean isBalancedBruteForce(TreeNode root) {
        if (root == null) return true;
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) > 1) return false;
        return isBalancedBruteForce(root.left) && isBalancedBruteForce(root.right);
    }
    private int height(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    // TC : O(n^2)
    // SC : O(n)
    private boolean isBalancedDFS(TreeNode root) {
        return dfs(root)[0] == 1;
    }
    private int[] dfs(TreeNode root) {
        if (root == null) return new int[]{1, 0};
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        boolean balanced = (left[0] == 1 && right[0] == 1) && (Math.abs(left[1] - right[1]) <= 1);
        int height = 1 + Math.max(left[1], right[1]);
        return new int[]{balanced ? 1 : 0, height};
    }
    // TC : O(n)
    // SC : O(h) 
    // Best Case (Balanced Tree): O(log n)
    // Worst Case (Degenerate Tree / Skewed Tree): O(n)
}