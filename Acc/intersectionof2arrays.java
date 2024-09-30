package Acc;

import java.util.HashSet;
import java.util.Set;

public class intersectionof2arrays {
    private static int[] intersection(int[] nums1, int[] nums2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int num : nums1) set1.add(num);
        for(int num : nums2) if(set1.contains(num)) set2.add(num);
        int[] resarr = new int[set2.size()];
        int idx = 0;
        for(int num : set2) resarr[idx++] = num;
        return resarr;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,5};
        int[] b = {6,3,2,6,6,5};
        System.out.println(intersection(a, b));
    }
}
