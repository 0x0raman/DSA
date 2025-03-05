package neetcode._4BinarySearch;

@SuppressWarnings("unused")
public class _1binarySearch {
    private int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while(l <= r){
            int m = l + ((r - l) / 2);
            if(nums[m] < target){
                l = m + 1;
            } else if(nums[m] > target){
                r = m - 1;
            } else{
                return m;
            }
        }
        return -1;
    }
}

//TC : O(logn)
//SC : O(1)