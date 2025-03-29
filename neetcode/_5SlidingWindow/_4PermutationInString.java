package neetcode._5SlidingWindow;

import java.util.Arrays;

@SuppressWarnings("unused")
public class _4PermutationInString {
    private boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];
        for(char c : s1.toCharArray()) s1Freq[c - 'a']++;
        int windowSize = s1.length();
        for(int i = 0; i < windowSize; i++) s2Freq[s2.charAt(i) - 'a']++;
        if(Arrays.equals(s1Freq, s2Freq)) return true;
        for(int i = windowSize; i < s2.length(); i++){
            s2Freq[s2.charAt(i) - 'a']++;
            s2Freq[s2.charAt(i - windowSize) - 'a']--;
            if(Arrays.equals(s1Freq, s2Freq)) return true;
        }
        return false;
        // TC : O(n)
        // not good for large inputs
        // remove equals
    }
    private boolean checkInclusionOptimized(String s1, String s2) {
        // If s1 is longer than s2, it's impossible for s1's permutation to be a substring of s2
        if (s1.length() > s2.length()) return false;
        // Frequency arrays for characters 'a' to 'z'
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        // Initialize frequency counts for s1 and the first window of s2
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++; // Count chars in s1
            s2Count[s2.charAt(i) - 'a']++; // Count chars in the first window of s2
        }
        // Count how many character frequencies match between s1Count and s2Count
        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] == s2Count[i]) matches++;
        }
        // Sliding window technique
        int l = 0;
        for (int r = s1.length(); r < s2.length(); r++) {
            // If all 26 character frequencies match, we found a valid permutation
            if (matches == 26) return true;
            // Add new character to the window
            int index = s2.charAt(r) - 'a';
            if (s1Count[index] == s2Count[index]) matches--; // If it was matching before, decrement matches
            s2Count[index]++; // Increment new character count
            if (s1Count[index] == s2Count[index]) matches++; // If it matches now, increment matches
            // Remove leftmost character from the window
            index = s2.charAt(l) - 'a';
            if (s1Count[index] == s2Count[index]) matches--; // If it was matching before, decrement matches
            s2Count[index]--; // Decrement old character count
            if (s1Count[index] == s2Count[index]) matches++; // If it matches now, increment matches
            // Move the left pointer to maintain window size
            l++;
        }
        // Final check in case the last window matches
        return matches == 26;
    }
    // TC : O(n)
    // SC : O(1)
}
