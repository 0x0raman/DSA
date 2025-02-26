package neetcode._1ArraysHashing;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("unused")
public class _9longestConsecutive {
    private int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int longest = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                int len = 1;
                while(set.contains(num + len)){
                    len++;
                }
                longest = Math.max(longest, len);
            }
        }
        return longest;
    }
}
//TC: O(n)
//SC: O(n)