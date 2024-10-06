package zop;

import java.util.HashSet;

public class longestRepeatingSubstring {
    private static String longestRepeating(String s) {
        int left = 1, right = s.length() - 1;
        String result = "";

        while (left <= right) {
            int mid = left + (right - left) / 2;
            String longest = search(s, mid);
            if (longest != null) {
                result = longest; // Found a repeating substring
                left = mid + 1; // Try for a longer length
            } else {
                right = mid - 1; // Try shorter length
            }
        }
        return result;
    }

    private static String search(String s, int length) {
        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i <= s.length() - length; i++) {
            String substring = s.substring(i, i + length);
            if (seen.contains(substring)) {
                return substring; // Found a repeating substring
            }
            seen.add(substring);
        }
        return null; // No repeating substring found
    }

    public static void main(String[] args) {
        String s = "banana";
        System.out.println("Longest repeating substring: " + longestRepeating(s));
    }
}

