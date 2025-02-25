package neetcode;

import java.util.HashMap;

@SuppressWarnings("unused")
class _2validAnagram {
    private boolean isAnagram(String s, String t) {
        // if(s.length() != t.length()) return false;
        // char[] p = s.toCharArray();
        // char[] q = t.toCharArray();
        // Arrays.sort(p);
        // Arrays.sort(q);
        // return Arrays.equals(p,q);

        // if(s.length()!=t.length()) return false;
        // HashMap<Character, Integer> p = new HashMap<>();
        // HashMap<Character, Integer> q = new HashMap<>();
        // for(int i=0; i<s.length(); i++){
        // p.put(s.charAt(i), p.getOrDefault(s.charAt(i),0)+1);
        // q.put(t.charAt(i), q.getOrDefault(t.charAt(i),0)+1);
        // }
        // return p.equals(q);

        if (s.length() != t.length())
            return false;
        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a']++;
            a[t.charAt(i) - 'a']--;
        }
        for (int val : a) {
            if (val != 0)
                return false;
        }
        return true;
    }
}

// TC: O(n)
// SC: O(1)