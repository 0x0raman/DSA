package ApnaClgSheet;

public class _1minMaxele {
    private static int minEle(int[] a, int n){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }
    private static int maxEle(int[] a, int n){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a = {1,2,0,3,4};
        int n = a.length;
        System.out.println(minEle(a, n));
        System.out.println(maxEle(a, n));
    }
}