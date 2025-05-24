package neetcode._7Trees;

@SuppressWarnings("unused")
public class _5sameBinaryTree {
    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p != null && q!= null && p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }
    // TC : O(n)
    // SC : O(h) 
    // Best Case (Balanced Tree): O(log n)
    // Worst Case (Degenerate Tree / Skewed Tree): O(n)
}