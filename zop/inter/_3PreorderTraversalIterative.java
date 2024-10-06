package zop.inter;

import java.util.Stack;

public class _3PreorderTraversalIterative {
    private static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    private static void preorderIterative(TreeNode root) {
        if (root == null)
            return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.val + " "); // Visit the root

            // Push right child first so that left child is processed first
            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // PreorderTraversalIterative traversal = new PreorderTraversalIterative();
        System.out.print("\nIterative Preorder Traversal: ");
        preorderIterative(root); // Output: 1 2 4 5 3
    }
}