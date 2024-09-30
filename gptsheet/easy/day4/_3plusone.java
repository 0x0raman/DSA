package gptsheet.easy.day4;

import java.util.Arrays;

public class _3plusone {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {1,2,3,9};
        System.out.println(Arrays.toString(plusOne(a)));
        System.out.println(Arrays.toString(plusOne(b)));
    }
    private static int[] plusOne(int[] digits){
        for(int i = digits.length-1; i>=0; i--){
            if(digits[i] + 1 != 10){
                digits[i]+=1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newdig = new int[digits.length + 1];
        newdig[0] = 1;
        return newdig;
    } 
}
