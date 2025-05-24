package neetcode._7Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

@SuppressWarnings("unused")
public class _1invertBinaryTree {
    private TreeNode invertTreeBFS(TreeNode root) {
        if (root == null) return null;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
            if (node.left != null) q.offer(node.left);
            if (node.right != null) q.offer(node.right);
        }
        return root;
    }
    // TC : O(n)
    // SC : O(n)
    private TreeNode invertTreeRecursiveDFS(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTreeRecursiveDFS(root.left);
        invertTreeRecursiveDFS(root.right);
        return root;
    }
    // TC : O(n)
    // SC : O(n)
    private TreeNode invertTreeIterativeDFS(TreeNode root) {
        if (root == null) return null;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            TreeNode node = st.pop();
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
            if (node.left != null) st.push(node.left);
            if (node.right != null) st.push(node.right);
        }
        return root;
    }
    // TC : O(n)
    // SC : O(n)
}