package topic_wise.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class _5finddupsarr {
    private static void uniqueint1(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        System.out.println(set);
    }
    private static void uniqueint2(int[] nums){
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(i == nums.length - 1 || !(nums[i] == nums[i+1])){
                arr[count] = nums[i];
                count++;
            } 
        }
        int[] duppnew = Arrays.copyOf(arr, count);
        for(int j : duppnew) System.out.print(j+" ");
        System.out.println();
    }
    private static void dupscheckint(int[] nums){
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    if(!res.contains(nums[i]))  res.add(nums[i]);
                }
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int[] a = {1,22,22,3,1,4};
        uniqueint1(a);
        uniqueint2(a);
        dupscheckint(a);
    }
}
