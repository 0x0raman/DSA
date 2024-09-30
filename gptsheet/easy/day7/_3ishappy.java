package gptsheet.easy.day7;

public class _3ishappy {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

    private static boolean isHappy(int n) {
        int slow = n, fast = n;
        do {
            slow = square(slow);
            fast = square(square(fast));
        } while (slow != fast);
        return slow == 1;
    }

    private static int square(int num) {
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans += rem * rem;
            num /= 10;
        }
        return ans;
    }
}