package ApnaClgSheet;

public class _3maxsubarray {
    private static int maxSubArr(int[] nums){
        int total = 0, res = nums[0];
        for(int i : nums){
            if(total < 0) total = 0;
            total += i;
            res = Math.max(total, res);
        }
        return res;
    } 
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArr(nums));
    }
}
