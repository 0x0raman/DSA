package Acc;

import java.util.HashSet;

public class containsduplicate {
    private static boolean conditionCheck(int[] nums){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<nums.length; i++){
        // for(int i:nums){
            if(hs.contains(nums[i])) return true;
            hs.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {3,314,21321,2131,1212,2332,3};
        System.out.println(conditionCheck(nums));
    }
}
