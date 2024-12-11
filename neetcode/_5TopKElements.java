package neetcode;

import java.util.*;

@SuppressWarnings("unused")
public class _5TopKElements {
    private static int[] sortedtopKFrequent(int[] nums, int k) {
        // Step 1: Count the frequency of each number
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Step 2: Create a list of frequency-number pairs
        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            arr.add(new int[] { entry.getValue(), entry.getKey() });
        }

        // Step 3: Sort the list by frequency in descending order
        arr.sort((a, b) -> b[0] - a[0]);

        // Step 4: Extract the top k frequent elements
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr.get(i)[1]; // Access the number (key) part
        }

        return res;
    }
    
    private int[] heapTopKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        // List<int[]> arr = new ArrayList<>();
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // arr.add(new int[] {entry.getValue(), entry.getKey()});
            heap.offer(new int[] { entry.getValue(), entry.getKey() });
            if (heap.size() > k) {
                heap.poll();
            }
        }
        // arr.sort((a, b) -> b[0] - a[0]);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = heap.poll()[1];
        }
        return res;
    }
}
