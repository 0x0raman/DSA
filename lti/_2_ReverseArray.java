package lti;

public class _2_ReverseArray {
    public static void revArray(int[] nums){
        int left = 0, right = nums.length - 1;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void revString(String[] nums){
        int left = 0, right = nums.length - 1;
        while(left < right){
            String temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,6};
        String[] n1 = {"a","b","c"};
        revArray(n);
        revString(n1);
        for(int i = 0; i < n.length; i++){
            System.out.print(n[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < n1.length; i++){
            System.out.print(n1[i] + " ");
        }
    }
}
