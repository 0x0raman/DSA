package Acc;

public class reversestring {
    private static void reverse(char[] s){
        int l=0, r=s.length-1;
        while(l<r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        char[] s = {'h','e','e','h'};
        reverse(s);
        System.out.println(s);
    }
}