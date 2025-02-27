package neetcode._2TwoPointers;

@SuppressWarnings("unused")
public class _4containerWithMostWater {
    private int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1, res = 0;
        while(l < r){
            int area = Math.min(heights[l], heights[r]) * (r - l);
            res = Math.max(area, res);
            if(heights[l] <= heights[r]) l++;
            else r--;
        }
        return res;
    }
}
//TC: O(n)
//SC: O(1)