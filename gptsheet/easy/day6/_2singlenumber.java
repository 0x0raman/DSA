package gptsheet.easy.day6;

public class _2singlenumber {
    public static void main(String[] args) {
        int[] a = {11,11,2,3,2,3,0};
        System.out.println(singleNumber(a));
    }
    
    private static int singleNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
        }
        return xor;
    }
}
