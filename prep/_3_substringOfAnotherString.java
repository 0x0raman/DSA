package prep;

public class _3_substringOfAnotherString {
    private static int findSubstringIndex(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i; // Match found
            }
        }
        return -1; // No match
    }

    public static void main(String[] args) {
        String text = "hello world";
        String pattern = "world";
        int index = findSubstringIndex(text, pattern);

        if (index != -1) {
            System.out.println("Substring found at index: " + index);
        } else {
            System.out.println("Substring not found.");
        }
    }
}

// time complexity : O(n.m)
// space complexity : O(1)