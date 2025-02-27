package neetcode._2TwoPointers;

@SuppressWarnings("unused")
public class _2twoSumII {
    private int[] twoSumOptimized(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while(l < r){
            int curSum = numbers[l] + numbers[r];
            if(curSum < target) r--;
            else if(curSum > target) l++;
            else return new int[]{l+1, r+1};
        }
        return new int[0];
    }
}
//TC: O(n)
//SC: O(1)