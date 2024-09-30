package gptsheet.easy.day5;

public class _1climbingstairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

    private static int climbStairs(int n) {
        if (n == 1 || n == 0)
            return 1;
        int p = 1, c = 1;
        for (int i = 2; i <= n; i++) {
            int temp = c;
            c = p + c;
            p = temp;
        }
        return c;
    }
}
