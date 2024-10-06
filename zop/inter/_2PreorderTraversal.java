package zop.inter;


public class _2PreorderTraversal {
    private static class TreeNode {
        int val;
        TreeNode left, right;
    
        TreeNode(int x) {
            val = x;
        }
    }
    private static void preorderRecursive(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " "); // Visit the root
        preorderRecursive(root.left);       // Traverse left subtree
        preorderRecursive(root.right);      // Traverse right subtree
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // _2PreorderTraversal traversal = new _2PreorderTraversal();
        System.out.print("Recursive Preorder Traversal: ");
        preorderRecursive(root); // Output: 1 2 4 5 3
    }
}
