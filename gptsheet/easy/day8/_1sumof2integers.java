package gptsheet.easy.day8;

public class _1sumof2integers {
    public static void main(String[] args) {
        int a = 22, b = 8;
        System.out.println(getSum(a, b));
    }
    private static int getSum(int a, int b){
        while(b!=0){
            int temp = (a&b) << 1;
            a^=b;
            b= temp;
        }
        return a;
    }
}
