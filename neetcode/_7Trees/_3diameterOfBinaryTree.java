package neetcode._7Trees;
@SuppressWarnings("unused")
public class _3diameterOfBinaryTree {
    private int diameterOfBinaryTree(TreeNode root) {
        int[] res = new int[1];
        dfs(root, res);
        return res[0];    
    }
    private int dfs(TreeNode root, int[] res) {
        if (root == null) return 0;
        int left = dfs(root.left, res);
        int right = dfs(root.right, res);
        res[0] = Math.max(res[0], left + right);
        return 1 + Math.max(left, right);
    }
    // TC : O(n)
    // SC : O(h) 
    // Best Case (Balanced Tree): O(log n)
    // Worst Case (Degenerate Tree / Skewed Tree): O(n)
}