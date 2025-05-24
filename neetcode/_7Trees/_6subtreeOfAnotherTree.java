package neetcode._7Trees;

@SuppressWarnings("unused")
public class _6subtreeOfAnotherTree {
    private boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) return true;
        if (root == null) return false;
        if (isSameTree(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p != null && q != null && p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }
    // TC : O(m * n)
    // SC : O(m + n)

    // Serialization And Pattern Matching pending for both TC & SC of O(m + n)
}
