package neetcode._2TwoPointers;

@SuppressWarnings("unused")
public class _1validpalindrome {
    private static boolean isPalindrome(String s) {
        String fixed = "";
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c) || Character.isDigit(c))
                fixed += c;
        }
        fixed = fixed.toLowerCase();
        int l = 0, r = fixed.length() - 1;
        while (l <= r) {
            if (fixed.charAt(l) != fixed.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
    //TC: O(n)
    //SC: O(n)
    
    private static boolean isPalindromeOptimised(String s) {
        int l = 0, r = s.length() - 1;
        while(l < r){
            while(l < r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while(l < r && !Character.isLetterOrDigit(s.charAt(r))) r--;
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    //TC: O(n)
    //SC: O(1)
}