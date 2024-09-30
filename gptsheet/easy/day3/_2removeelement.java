package gptsheet.easy.day3;

import java.util.Arrays;

public class _2removeelement {
    public static void main(String[] args) {
        int[] a = { 1, 2, 34, 2 };
        int newLength = removeElement(a, 2);
        // Create a new array with the new length and copy the relevant elements
        int[] result = Arrays.copyOfRange(a, 0, newLength);
        // Print the array in the desired format
        System.out.println(Arrays.toString(result));
    }

    private static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length - 1; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}