package gptsheet.easy.day1;

public class _1twosum {
    public static void main(String[] args) {
        int[] j = {1,2,3,4};
        _1twosum f = new _1twosum();
        f.twoSum(j, 4);
    }
    private int[] twoSum(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
