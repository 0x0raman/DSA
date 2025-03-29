package neetcode._5SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unused")
public class _2LongSubWithoutRepChar {
    private int lengthOfLongestSubstringBruteForce(String s) {
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = i; j < s.length(); j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                set.add(s.charAt(j));
            }
            res = Math.max(res, set.size());
        }
        return res;
        //TC : O(n*m)
        //SC : O(m)
    }
    private int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l = 0, res = 0;
        for(int r = 0; r < s.length(); r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(r));
                l++;
            }
            set.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }
        return res;
        //TC : O(n)
        //SC : O(m)
    }
    private int lengthOfLongestSubstring2(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, res = 0;
        for(int r = 0; r < s.length(); r++){
            if(map.containsKey(s.charAt(r))){
                l = Math.max(map.get(s.charAt(r)) + 1, l);
            }
            map.put(s.charAt(r), r);
            res = Math.max(res, r - l + 1);
        }
        return res;
        //TC : O(n)
        //SC : O(m)
    }
}