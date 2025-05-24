package neetcode._7Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@SuppressWarnings("unused")
public class _8levelOrderTraversalBT {
    List<List<Integer>> res = new ArrayList<>();
    private List<List<Integer>> levelOrderDFS(TreeNode root) {
        dfs(root, 0);
        return res;
    }
    private void dfs(TreeNode node, int depth) {
        if (node == null) return;
        if (res.size() == depth) {
            res.add(new ArrayList<>());
        }
        res.get(depth).add(node.val);
        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);
    }
    // TC : O(n)
    // SC : O(n)
    private List<List<Integer>> levelOrderBFS(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            List<Integer> lvl = new ArrayList<>();
            for (int i = q.size(); i > 0; i--) {
                TreeNode node = q.poll();
                if (node != null) {
                    lvl.add(node.val);
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            if (lvl.size() > 0) {
                res.add(lvl);
            }
        }
        return res;
    }
    // TC : O(n)
    // SC : O(n)
}
