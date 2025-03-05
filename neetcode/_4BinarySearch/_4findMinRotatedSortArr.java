package neetcode._4BinarySearch;

@SuppressWarnings("unused")
public class _4findMinRotatedSortArr {
    private int findMin(int[] nums) { //Lower Bound Binary Search
        int l = 0, r = nums.length - 1;
        while(l < r){
            int m = l + (r - l) / 2;
            if(nums[m] < nums[r]) r = m;
            else l = m + 1;
        }
        return nums[l];
    }
}
//TC : O(logn)
//SC : O(1)