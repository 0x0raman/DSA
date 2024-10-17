package ib;

public class _10_missingnumber {
    private static int missingNumber(int[] nums) {
        // int n = (nums.length*(nums.length+1))/2;
        // int c=0;
        // for(int i=0; i<nums.length; i++){
        // c+=nums[i];
        // }
        // return (n-c);
        // }

        int res = 0;
        for (int i = 1; i <= nums.length; i++) {
            res ^= i;
        }
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
}
