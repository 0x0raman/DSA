package gptsheet.easy.day6;

public class _1validpalindrome {
    public static void main(String[] args) {
        String s = " racecar ";
        System.out.println(isPalindrome(s));
    }

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
}
