package gptsheet.easy.day7;

// import java.util.ArrayList;n
import java.util.Arrays;
// import java.util.HashMap;
// import java.util.List;

public class _1intersectionof2arrays2 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 45, 4 };
        int[] b = { 5, 7, 5, 45, 1, 3, 4 };
        System.out.println(Arrays.toString(intersect(a, b)));

    }

    private static int[] intersect(int[] nums1, int[] nums2) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int num : nums1){
        // map.put(num, map.getOrDefault(num, 0) + 1);
        // }
        // List<Integer> list = new ArrayList<>();
        // for(int num : nums2){
        // if(map.containsKey(num) && map.get(num) > 0){
        // list.add(num);
        // map.put(num, map.get(num) - 1);
        // }
        // }
        // int[] arr = new int[list.size()];
        // for(int i = 0; i<list.size(); i++){
        // arr[i] = list.get(i);
        // }
        // return arr;
        int[] c = new int[1001];
        for (int i = 0; i < nums1.length; i++) {
            c[nums1[i]]++;
        }
        int k = 0;
        int[] ans = new int[nums2.length];
        for (int i = 0; i < nums2.length; i++) {
            if (c[nums2[i]] > 0) {
                ans[k] = nums2[i];
                c[nums2[i]]--;
                k++;
            }
        }
        return Arrays.copyOfRange(ans, 0, k);
    }
}