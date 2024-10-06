package zop.inter;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    private static String largestNumber(int[] nums) {
        // Convert the integers to strings
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Sort the strings based on custom comparator
        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                // Compare concatenated results
                return (y + x).compareTo(x + y);
            }
        });

        // If the largest number is "0", the result is "0"
        if (strNums[0].equals("0")) {
            return "0";
        }

        // Build the largest number from sorted strings
        StringBuilder largestNumber = new StringBuilder();
        for (String num : strNums) {
            largestNumber.append(num);
        }

        return largestNumber.toString();
    }

    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        String result = largestNumber(nums);
        System.out.println("Largest number formed: " + result); // Output: "9534330"
    }
}