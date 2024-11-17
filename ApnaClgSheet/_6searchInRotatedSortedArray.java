package ApnaClgSheet;

public class _6searchInRotatedSortedArray {
    private static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target <= nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (nums[mid] <= target && target <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }

    private static int searchprac(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target <= nums[mid])
                    low = mid + 1;
                else
                    high = mid - 1;
            } else {
                if (nums[high] <= target && target <= nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 5, 1, 2, 3 };
        System.out.println(search(nums, 2));
        System.out.println(searchprac(nums, 2));
    }
}
