package topic_wise.arrays;

public class _2reversearr {
    private static int reve(int num){
        int rev = 0;
        while(num != 0){
            int lastd = num % 10;
            num /= 10;
            rev = (rev * 10) + lastd;
        }
        return rev;
    }
    public static void main(String[] args) {
        int a = 1234;
        System.out.println(reve(a));
    }
}
