package neetcode;

import java.util.HashMap;
@SuppressWarnings("unused")
public class _3twoSum {
    private int[] twoSumBruteforce(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target) return new int[] {i,j};
            }
        }
        return new int[] {};
    }
    private int[] twoSumOnePass(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff))
                return new int[] { map.get(diff), i };
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}