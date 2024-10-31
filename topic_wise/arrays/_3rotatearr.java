package topic_wise.arrays;

public class _3rotatearr {
    private static void rotate1by1(int[] nums){
        int last_el = nums[nums.length - 1], i;
        for(i = nums.length-1; i > 0; i--){
            nums[i] = nums[i-1];
        }
        nums[0] = last_el;
        for(int j : nums){
            System.out.print(j+" ");
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        rotate1by1(a);
    }
}
