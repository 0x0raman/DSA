package Acc;

public class validpalindrome {
    private static boolean isPalindrome(String s){
        String fixed="";
        for(char c : s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)) fixed+=c;
        }
        fixed = fixed.toLowerCase();
        int l = 0, r = fixed.length() - 1;
        
        while(l<=r){
            if(fixed.charAt(l)!=fixed.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = ("racecar 9 racecar");
        System.out.println(isPalindrome(s));
    }
}