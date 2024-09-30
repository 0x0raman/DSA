package gptsheet.easy.day7;

import java.util.Arrays;

public class _2movezeroes {
    public static void main(String[] args) {
        int[] num = { 1, 0, 2, 0, 33, 3, 3, 1, 0 };
        moveZeroes(num);
        System.out.println(Arrays.toString(num));
    }

    private static void moveZeroes(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
    }
}
