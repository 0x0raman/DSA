package experiments;

public class test {
    private static String expansion(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i+=2){
            char c = s.charAt(i);
            int count = Character.getNumericValue(s.charAt(i+1));
            while(count>0){
                sb.append(c);
                count--;
            }
        }
        return sb.toString();
    }
    private static String compression(String s){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i = 0; i < s.length(); i++){
            if(i+1<s.length() && s.charAt(i) == s.charAt(i+1)) count++;
            else{
                sb.append(s.charAt(i));
                sb.append(count);
                count=1;
            }   
        }
        return sb.toString();
    }
    private static int compression2(char[] s){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i = 0; i<s.length; i++){
            if(i+1<s.length && s[i] == s[i+1]) count++;
            else{
                sb.append(s[i]);
                if(count>1) sb.append(count);
            }
            count = 1;
        }
        char[] c_arr = sb.toString().toCharArray();
        for(int i = 0; i < c_arr.length; i++) s[i] = c_arr[i];
        return c_arr.length;
    }

    private static void linearSearch(int[] nums, int k){
        for(int i=0; i<nums.length; i++){
            if(k == nums[i]) System.out.println(nums[i]+" found");
        }
    }

    private static int binarySearch(int[] nums, int k){
        int l = 0, r = nums.length - 1;
        while(l<=r){
            int mid = l + (r - l) / 2;
            if(nums[mid] == k) return nums[mid];
            if(nums[mid]<k) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    private static String minmaxNum(int[] num){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            if(num[i] < min) min = num[i];
        }
        for(int i=0; i<num.length; i++){
            if(num[i] > max) max = num[i];
        }
        return min+" "+max;
    }
    private static int reverseInt(int nums){
        int rev = 0;
        while(nums!=0){
            int lastd = nums % 10;
            nums /= 10;
            rev = (rev * 10) + lastd;
        }
        return rev;
    }

    private static String reverseString1(String s){
        char[] charArray = s.toCharArray();
        int l = 0, r = charArray.length-1;
        while(l<r){
            char temp = charArray[r];
            charArray[r] = charArray[l];
            charArray[l] = temp;
            l++;
            r--;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        String a = "a3b2c7";
        System.out.println(expansion(a)); 
        String b = "aaabbb";
        System.out.println(compression(b));
        char[] c = {'a','a','a','b','b','b'};
        System.out.println(compression2(c));
        int[] d = {1,2,3,4};
        linearSearch(d, 4);
        System.out.println(binarySearch(d, 3));
        System.out.println(minmaxNum(d));
        System.out.println(reverseInt(1234));
        System.out.println(reverseString1(a));
    }
}
