package Acc;
// import javax.swing.tree.TreeNode;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    // Default constructor
    TreeNode() {
    }

    // Constructor with value
    TreeNode(int val) {
        this.val = val;
    }

    // Constructor with value, left, and right children
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class validateBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        boolean result = isValidBST(root);
        System.out.println(result);
    }

    private static boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean valid(TreeNode node, long min, long max) {
        if (node == null)
            return true;
        if (node.val <= min || node.val >= max)
            return false;
        return valid(node.left, min, node.val) && valid(node.right, node.val, max);
    }
}
