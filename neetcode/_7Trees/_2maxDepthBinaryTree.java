package neetcode._7Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

@SuppressWarnings("unused")
public class _2maxDepthBinaryTree {
    private int maxDepthBFS(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) q.add(root);
        int lvl = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            lvl++;
        }
        return lvl;
    }
    // TC : O(n)
    // SC : O(n)
    private int maxDepthIterativeDFS(TreeNode root) {
        Stack<Pair<TreeNode, Integer>> st = new Stack<>();
        st.push(new Pair<>(root, 1));
        int res = 0;
        while (!st.isEmpty()) {
            Pair<TreeNode, Integer> cur = st.pop();
            TreeNode node = cur.getKey();
            int depth = cur.getValue();
            if (node != null) {
                res = Math.max(res, depth);
                st.push(new Pair<TreeNode, Integer>(node.left, depth + 1));
                st.push(new Pair<TreeNode, Integer>(node.right, depth + 1));
            }
        }
        return res;
    }
    // TC : O(n)
    // SC : O(n)
    private int maxDepthRecursiveDFS(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepthRecursiveDFS(root.left), maxDepthRecursiveDFS(root.right));
    }
    // TC : O(n)
    // SC : O(h) 
    // Best Case (Balanced Tree): O(log n)
    // Worst Case (Degenerate Tree / Skewed Tree): O(n)
}
