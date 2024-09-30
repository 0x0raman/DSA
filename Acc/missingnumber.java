package Acc;

public class missingnumber {
    private static int missingNumber(int[] nums){
        // int e=nums.length;
        // int actualsum = (e*(e+1))/2;
        // int currentsum=0;
        // for(int i=0; i<nums.length; i++){
        //     currentsum+=nums[i];
        // }
        // return (actualsum-currentsum);
        // XOR all numbers from 1 to n (where n is nums.length)

        int res = 0;
        for (int i = 1; i <= nums.length; i++) {
            res ^= i; // XOR the current number with res
        }
        // XOR all numbers in the array
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i]; // XOR the current array element with res
        }
        // The remaining value in res is the missing number
        return res;
    }
    public static void main(String[] args) {
        int[] a={0,1,2,3,4,5,7};
        System.out.println(missingNumber(a));
    }
}