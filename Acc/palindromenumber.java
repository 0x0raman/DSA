package Acc;
public class palindromenumber {
    private static boolean isPalindrome(int x){
        if(x==0) return true;
        if(x<0 || x%10 == 0) return false;
        int rev=0;
        while(x>rev){
            int pop = x%10;
            x/=10;
            rev=(rev*10) + pop;
        }
        if(x==rev || x == rev/10) return true;
        return false;
    }

    public static void main(String[] args) {
        int x = 12221;
        System.out.println(isPalindrome(x));
    }
}
