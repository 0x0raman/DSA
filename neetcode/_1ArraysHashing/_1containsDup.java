package neetcode._1ArraysHashing;

import java.util.HashSet;
import java.util.Set;

public class _1containsDup {
    @SuppressWarnings("unused")
    private static boolean hasDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for (int i : nums) {
            if (hs.contains(i)) {
                return true;
            }
            hs.add(i);
        }
        return false;
        // for(int i = 0; i<nums.length; i++){
        // for(int j = i+1; j<nums.length; j++){
        // if(nums[i]==nums[j]) return true;
        // }
        // }
        // return false;
    }
}

// TC: O(n)
// SC: O(1)