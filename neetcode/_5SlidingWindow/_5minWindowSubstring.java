package neetcode._5SlidingWindow;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class _5minWindowSubstring {
    private String minWindowBrute(String s, String t) {
        if(t.isEmpty()) return "";
        HashMap<Character, Integer> countT = new HashMap<>();
        for(char c : t.toCharArray()){
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }
        int[] res = {-1, -1};
        int resLen = Integer.MAX_VALUE;
        for(int i = 0; i < s.length(); i++){
            HashMap<Character, Integer> countS = new HashMap<>();
            for(int j = i; j < s.length(); j++){
                countS.put(s.charAt(j), countS.getOrDefault(s.charAt(j), 0) + 1);
                boolean flag = true;
                for(char c : countT.keySet()){
                    if(countS.getOrDefault(c, 0) < countT.get(c)){
                        flag = false;
                        break;
                    }
                }
                if(flag && (j - i + 1) < resLen){
                    resLen = j - i + 1;
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
    // TC : O(n^2)
    // SC : O(m)
    
    private String minWindowOptimized(String s, String t) {
        if(t.isEmpty()) return "";
        Map<Character, Integer> countT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>(); 
        for(char c : t.toCharArray()) {
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }
        int have = 0, need = countT.size();
        int[] res = {-1, -1};
        int resLen = Integer.MAX_VALUE;
        int l = 0;
        for(int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if(countT.containsKey(c) && window.get(c).equals(countT.get(c))) {
                have++;
            }
            while(have == need) {
                if((r - l + 1) < resLen) {
                    resLen = r - l + 1;
                    res[0] = l;
                    res[1] = r;
                }
                char leftChar = s.charAt(l);
                window.put(leftChar, window.get(leftChar) - 1);
                if(countT.containsKey(leftChar) && window.get(leftChar) < countT.get(leftChar)) {
                    have--;
                }
                l++;
            }
        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1); 
    }
    // TC : O(n)
    // SC : O(m)
    
    private String minWindowOptimizedShorter(String s, String t) {
        int[] freq = new int[128];
        for(char c : t.toCharArray()) freq[c]++;
        int l = 0, r = 0, minLen = (int)1e8, start = 0, need = t.length();
        while(r < s.length()) {
            if(freq[s.charAt(r++)]-- > 0) need--;
            while(need == 0) {
                if(r - l < minLen) {
                    minLen = r - l;
                    start = l;
                }
                if(freq[s.charAt(l++)]++ == 0) need++;
            }
        }
        return minLen == (int)1e8 ? "" : s.substring(start, start + minLen);
    }
    // TC : O(n)
    // SC : O(m)
}