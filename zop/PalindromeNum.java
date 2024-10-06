package zop;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalid(n));
        sc.close();
    }
    private static boolean isPalid(int num){
        long rev = 0;
        int x = num;
        if(x<0) return false;
        while(num!=0){
            int lastd = num%10;
            num/=10;
            rev=(rev*10)+lastd;
        }
        System.out.println(rev);
        if(rev == x) return true;
        else return false;
    }
}