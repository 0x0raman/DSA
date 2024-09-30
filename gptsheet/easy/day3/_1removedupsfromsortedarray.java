package gptsheet.easy.day3;

// import java.util.HashSet;

public class _1removedupsfromsortedarray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,3,3,4,2};
        System.out.println(removeDuplicates(a));
    }
    private static int removeDuplicates(int[] nums){
        // HashSet<Integer> hs = new HashSet<>();
        // int idx = 0;
        // for(int i : nums){ 
        //     if(!hs.contains(i)){
        //         hs.add(i);
        //         nums[idx] = i;
        //         idx++;
        //     }
        // }
        // return idx;
        int i = 0;
        for(int j=i; i<nums.length-1; i++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i;
    }
}
