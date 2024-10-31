package topic_wise.arrays;

public class _1minmaxEle {
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

    public static void main(String[] args) {
        int[] d = {1,2,3,4};
        System.out.println(minmaxNum(d));
    }
}
