package ApnaClgSheet;

import java.util.HashSet;
import java.util.Set;

public class _4containsDuplicate {
    private static boolean contDuplicate(int[] nums) {
       Set<Integer> hs = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(hs.contains(nums[i])) return true;
            hs.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 4, 8};
        System.out.println(contDuplicate(nums));
    }
}
