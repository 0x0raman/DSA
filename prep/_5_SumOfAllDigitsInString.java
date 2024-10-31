package prep;

public class _5_SumOfAllDigitsInString {
    public static int sumDigitsInString(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') { // Check if the character is a digit
                sum += ch - '0'; // Convert char digit to its integer value
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String str = "abc123xyz";
        System.out.println("Sum of digits: " + sumDigitsInString(str));
    }
}

// time complexity : O(n)
// space complexity : O(1)