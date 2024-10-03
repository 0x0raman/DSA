package gptsheet.easy.day1;

public class _2reverseint {
    public static void main(String[] args) {
        int a = 1534236469;
        reverse(a);
        System.out.println(reverse(a));
    }

    static int reverse(int a) {
        long rev = 0;
        // for(int i=0; i<=a.length; i++){
        while (a != 0) {
            System.out.println("--------------");
            int lastd = a % 10;
            System.out.println("lastd: " + lastd);
            a /= 10;
            System.out.println("a: " + a);
            rev = (rev * 10) + lastd;
            System.out.println("rev: " + rev);
            // System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
            if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE)
                return 0;
        }
        return (int) rev;
    }
}