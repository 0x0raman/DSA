package gptsheet.easy.day1;

public class _3ispalindrome {
    public static void main(String[] args) {
        int x = 122221;
        System.out.println(isPalindrome(x));
    }
    
    private static boolean isPalindrome(int x) {
        long rev = 0;
        if(x<0) return false;
        int y = x;
        while (x != 0) {
            int lastd = x % 10;
            x /= 10;
            rev = (rev * 10) + lastd;
        }
        return (rev == y);
    }
}
