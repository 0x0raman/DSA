package prep;

public class _4_AllNonZeroes {
    private static void separateZeroes(int[] arr) {
        int j = 0; // Pointer for the next non-zero position

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        // Fill remaining elements with zero
        for (int k = j; k < arr.length; k++) {
            arr[k] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 0, 0, 2, 1, 8, 9, 0, 1};
        separateZeroes(arr);

        System.out.print("Array after separation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

// time complexity : O(n)
// space complexity : O(1)