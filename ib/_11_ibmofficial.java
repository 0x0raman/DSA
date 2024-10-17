package ib;
import java.util.*;

public class _11_ibmofficial {
    public static void ret(List<String> strips) {
        Collections.sort(strips, (s1, s2) -> {
            int num1 = Character.getNumericValue(s1.charAt(0));
            int num2 = Character.getNumericValue(s2.charAt(0));
            return Integer.compare(num1, num2);
        });
        StringBuilder line1 = new StringBuilder(); 
        StringBuilder line2 = new StringBuilder(); 
        for (String strip : strips) {
            if (strip.length() > 1) {
                line1.append(strip.charAt(1));
            }
            if (strip.length() > 2) {
                line2.append(strip.charAt(2));
            }
        }
        System.out.println(line1.toString());
        System.out.println(line2.toString());
    }
    public static void main(String[] args) {
        List<String> input = Arrays.asList("9","1Au","4uF","3qx");
        ret(input);
    }
}
