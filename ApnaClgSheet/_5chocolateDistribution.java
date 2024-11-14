package ApnaClgSheet;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class _5chocolateDistribution {
    private static int findminDiff(int[] arr, int m) {
        int n = arr.length;
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        return minDiff;
    }

    // gfg prblm
    private static int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        // int n = arr.size();
        // int[] a = new int[n];
        // for (int j = 0; j < n; j++) {
        // a[j] = arr.get(j);
        // }
        // Arrays.sort(a);
        // int minDiff = Integer.MAX_VALUE;
        // for (int i = 0; i + m - 1 < n; i++) {
        // int diff = a[i + m - 1] - a[i];
        // if (diff < minDiff)
        // minDiff = diff;
        // }
        // return minDiff;
        // --------------------------------------------------------------
        int[] arr1 = arr.stream().mapToInt(i -> i).toArray();
        Arrays.sort(arr1);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < arr1.length; i++) {
            int diff = arr1[i + m - 1] - arr1[i];
            if (diff < minDiff)
                minDiff = diff;
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int[] a = { 7, 3, 2, 4, 9, 12, 56 };
        List<Integer> a2 = Arrays.asList(7, 3, 2, 4, 9, 12, 56);
        ArrayList<Integer> a3 = new ArrayList<>();
        a3.addAll(a2);
        System.out.println(findminDiff(a, 3));
        System.out.println(findMinDiff(a3, 3));
    }
}
