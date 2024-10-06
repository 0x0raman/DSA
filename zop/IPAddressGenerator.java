package zop;

import java.util.ArrayList;
import java.util.List;

public class IPAddressGenerator {
    private static List<String> generateIPAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(result, s, "", 0, 0);
        return result;
    }

    private static void backtrack(List<String> result, String s, String currentIP, int start, int segments) {
        // If we have 4 segments and are at the end of the string
        if (segments == 4 && start == s.length()) {
            result.add(currentIP);
            return;
        }

        // If we have 4 segments but haven't reached the end, or if we have too many
        // characters left
        if (segments == 4 || start == s.length()) {
            return;
        }

        // Try segments of length 1 to 3
        for (int len = 1; len <= 3; len++) {
            if (start + len > s.length())
                break; // Out of bounds
            String segment = s.substring(start, start + len);
            if (isValid(segment)) {
                backtrack(result, s, currentIP + (segments == 0 ? "" : ".") + segment, start + len, segments + 1);
            }
        }
    }

    private static boolean isValid(String segment) {
        // Check if segment is valid
        if (segment.length() > 1 && segment.startsWith("0"))
            return false; // No leading zeros
        int num = Integer.parseInt(segment);
        return num >= 0 && num <= 255; // Must be between 0 and 255
    }

// second method ----------------------------------------------------------------------------------------//
private static void solve(String s, int i, int j, int level, String temp, ArrayList<String> res) {
    if (i == (j + 1) && level == 5) {
        res.add(temp.substring(1));
    }
    
    // Digits of a number ranging 0-255 can lie only between
    // 0-3
    for (int k = i; k < i + 3 && k <= j; k++) {
        String ad = s.substring(i, k + 1);
        
        // Return if string starting with '0' or it is
        // greater than 255.
        if ((s.charAt(i) == '0' && ad.length() > 1) || Integer.valueOf(ad) > 255)
        return;
        
        // Recursively call for another level.
        solve(s, k + 1, j, level + 1, temp + '.' + ad, res);
    }
}

public static void main(String[] args) {
    String s = "25525511135"; // Example input
    List<String> ipAddresses = generateIPAddresses(s);
    System.out.println("Possible valid IP addresses: " + ipAddresses);
    
    // second method ----------------------------------------------------------------------------------------//
    String a = "25525511135";
    int n = a.length();
    
    ArrayList<String> ans = new ArrayList<>();
    
    solve(s, 0, n - 1, 1, "", ans); 
    System.out.println(ans);
    for (String s1 : ans)
        System.out.println(s1);
    }
}
