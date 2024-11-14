package tft;

public class _1reverseanarray{
    private static void reverseArray(int[] nums){
        int left = 0, right = nums.length-1;
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] n = {1,2,3,4};
        reverseArray(n);
        for(int i = 0; i < n.length; i++){
            System.out.print(n[i]+" ");
        }
    }
}