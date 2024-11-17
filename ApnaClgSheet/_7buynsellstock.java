package ApnaClgSheet;

public class _7buynsellstock{
    private static int maxProfit(int[] prices){
        int buy = prices[0], maxProf = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            else{
                int profit = prices[i] - buy;
                maxProf = Math.max(maxProf, profit);
            }
        }
        return maxProf;
    }
    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        System.out.println(maxProfit(a));
    }
}