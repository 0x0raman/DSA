package neetcode._5SlidingWindow;

import java.util.Deque;
import java.util.LinkedList;

@SuppressWarnings("unused")
public class _6maxSlidingWindow {
    private int[] maxSlidingWindowBrute(int[] nums, int k) {
        int n = nums.length;
        int[] output = new int[n - k + 1];
        for (int i = 0; i <= n - k; i++) {
            int max = nums[i];
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, nums[j]);
            }
            output[i] = max;
        }
        return output;
    }
    //TC : O(n * k)
    //SC : O(1) extra space but for output array O(n - k + 1)

    private int[] maxSlidingWindowOptimized(int[] nums, int k) {
        int n = nums.length;
        int[] output = new int[n - k + 1];
        Deque<Integer> q = new LinkedList<>();
        int l = 0, r = 0;
        while (r < n) {
            if (!q.isEmpty() && nums[q.getLast()] < nums[r]) {
                q.removeLast();
            }
            q.addLast(r);
            if (l < q.getFirst()) {
                q.removeFirst();
            }
            if ((r + 1) >= k) {
                output[l] = nums[q.getFirst()];
                l++;
            }
            r++;
        }
        return output;
    }
    //TC : O(n)
    //SC : O(n)
}
