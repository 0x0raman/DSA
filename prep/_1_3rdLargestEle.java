package prep;

public class _1_3rdLargestEle {
    private static int _3rdlarele(int[] nums){
        if (nums.length < 3) throw new IllegalArgumentException("Array must have at least 3 elements.");

        // Implement a simple selection sort
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap elements
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

        return nums[nums.length - 3];
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 8, 9, 3};
        System.out.println("Third largest element: " + _3rdlarele(arr));
    } 
}

// time complexity : O(n^2) coz of selection sort
// space complexity : O(n)