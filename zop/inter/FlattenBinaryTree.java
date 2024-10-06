package zop.inter;


public class FlattenBinaryTree {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    
        TreeNode(int x) {
            val = x;
        }
    }
    private void flatten(TreeNode root) {
        if (root == null) return;

        // Flatten the left and right subtree
        flatten(root.left);
        flatten(root.right);

        // Store the left and right child
        TreeNode left = root.left;
        TreeNode right = root.right;

        // Set the left child to null
        root.left = null;

        // Attach the left subtree to the right
        root.right = left;

        // Find the end of the new right subtree and attach the original right subtree
        TreeNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        current.right = right;
    }

    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        FlattenBinaryTree solution = new FlattenBinaryTree();
        solution.flatten(root);

        // Print the flattened tree
        TreeNode current = root;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.right;
        }
        // Output: 1 2 3 4 5 6
    }
}