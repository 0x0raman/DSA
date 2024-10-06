package zop.inter;

public class _1ReverseArrayRecursion {
    public static void reverse(int[] arr, int start, int end) {
        if (start >= end) return; // Base case
        // Swap elements
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call
        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr, 0, arr.length - 1);
        System.out.println("Reversed array: " + java.util.Arrays.toString(arr)); // Output: [5, 4, 3, 2, 1]
    }
}

