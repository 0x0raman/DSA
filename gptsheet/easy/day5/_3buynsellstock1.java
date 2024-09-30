package gptsheet.easy.day5;

public class _3buynsellstock1 {
    public static void main(String[] args) {
        int[] p = { 2, 1, 3, 4, 5, 1 };
        System.out.println(maxProfit(p));
    }

    private static int maxProfit(int[] prices) {
        int max = 0, curr = prices[0];
        for (int i : prices) {
            if (curr > prices[i])
                curr = prices[i];
            max = Math.max(max, prices[i] - curr);
        }
        return max;
    }
}
