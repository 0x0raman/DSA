package gptsheet.easy.day1;

import java.util.Arrays;
import java.util.HashMap;
public class _1twosum {
    public static void main(String[] args) {
        int[] j = {1,2,3,4};
        _1twosum f = new _1twosum();
        System.out.println(Arrays.toString(f.twoSum(j, 4)));
        System.out.println(Arrays.toString(f.twoSumOptimised(j, 4)));
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
    private int[] twoSumOptimised(int[] nums, int target) {
        HashMap<Integer, Integer> map =new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int calc = target - nums[i];
            if(map.containsKey(calc)){
                return new int[]{map.get(calc), i};
            }
            map.put(nums[i] , i);
        }
        return new int[]{};
    }
}
