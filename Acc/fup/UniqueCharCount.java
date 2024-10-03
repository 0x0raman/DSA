package Acc.fup;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * UniqueCharCount
 */
public class UniqueCharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(unique(s));
        sc.close();
    }

    private static int unique(String s) {
        Set<Character> set = new HashSet<Character>();
        // s = s.replaceAll("[{}]", "");
        // String[] e = s.split(",");
        // int count = 0;
        // for (String e1 : e) {
        //     for (char i : e1.trim().toCharArray()) {
        //         set.add(i);
        //         // count++;
        //     }
        // }
        // return set.size();
        for (char i : s.toCharArray()) {
            set.add(i);
            // if(s.charAt(i) == ',') return set.size();
        }
        return set.size();
    }
}