package gptsheet.easy.day4;

public class _1searchinsertposition {
    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 6 };
        System.out.println(searchInsert(a, 5));
    }

    private static int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target)
                return m;
            else if (nums[m] > target)
                r = m - 1;
            else
                l = m + 1;
        }
        return l;
    }
}