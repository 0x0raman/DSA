package gptsheet.medium.day8;

public class _2contatinerwithmostwater {
    public static void main(String[] args) {
        int[] a = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(a));
    }
    private static int maxArea(int[] height){
        int len = 0, maxArea = 0, l = 0, r = height.length - 1;
        while(l<r){
            len = Math.min(height[l], height[r]);
            maxArea = Math.max(maxArea, len * (r - l));
            while(l<r && height[l] <= len) l++;
            while(l<r && height[r] <= len) r--;
        }
        return maxArea;
    }
}