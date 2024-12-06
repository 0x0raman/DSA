package bnp;

import java.util.*;

public class _1permutation {
    static void permutations(String str) {
        // List to hold valid passwords
        Set<String> validPasswords = new TreeSet<>();
        
        // Generate all permutations
        generatePermutations(str, "", validPasswords);
        
        // Print the result
        for (String password : validPasswords) {
            System.out.print(password + " ");
        }
    }

    // Helper function to generate all permutations
    static void generatePermutations(String str, String prefix, Set<String> validPasswords) {
        if (str.length() == 0) {
            // Only add to the list if the permutation starts with a digit
            if (Character.isDigit(prefix.charAt(0))) {
                validPasswords.add(prefix);
            }
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            // Skip duplicates to avoid redundant permutations
            if (i > 0 && str.charAt(i) == str.charAt(i - 1)) {
                continue;
            }
            
            // Choose character at index i and swap it with the rest of the string
            generatePermutations(str.substring(0, i) + str.substring(i + 1), prefix + str.charAt(i), validPasswords);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        permutations(str);
        sc.close();
    }
}


// Sample Input 1:
// aB3
// Sample Output 1:
// 3Ba 3aB
// Sample Input 2:
// dd4dd
// Sample Output 2:
// 4dddd