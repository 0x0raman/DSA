package neetcode._4BinarySearch;

@SuppressWarnings("unused")
public class _5searchInRotatedSortArr {
    private int search(int[] nums, int target) {
        int l = 0, r = nums.length;
        while(l <= r){
            int m = (l + r) / 2;
            if(nums[m] == target) return m;
            if(nums[l] <= nums[r]){
                if(target > nums[m] || target < nums[l]) l = m + 1;
                else r = m - 1;
            } else{
                if(target < nums[m] || target > nums[r]) r = m - 1;
                else l = m + 1;
            }
        }
        return -1;
    }
}
//TC : O(logn)
//SC : O(1)