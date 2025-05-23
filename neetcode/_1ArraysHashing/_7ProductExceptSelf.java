package neetcode._1ArraysHashing;

@SuppressWarnings("unused")
public class _7ProductExceptSelf {
    private int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for(int i = 1; i < nums.length; i++){
            res[i] = res[i - 1] * nums[i - 1];
        }
        int postfix = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            res[i] *= postfix;
            postfix *= nums[i];
        }
        return res;
    }
}
//TC: O(n)
//SC: O(1)