package ib;

import java.util.Arrays;

public class _6longestcommonprefix {
    private static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0], s2 = strs[strs.length - 1];
        int id = 0;
        while(id< s1.length() && id < s2.length()){
            if(s1.charAt(id) == s2.charAt(id)) id++;
            else break;
        }
        return s1.substring(0, id);
    }
    public static void main(String[] args) {
        String[] a = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(a));
    }
}
