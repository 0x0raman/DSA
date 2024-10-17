package ib;

public class _4maxsubarray {
    private static int maxSubArray(int[] nums){
        int res = nums[0], total = 0;
        for(int i : nums){
            if(total<0) total=0;
            total+=i;
            res = Math.max(res, total);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}