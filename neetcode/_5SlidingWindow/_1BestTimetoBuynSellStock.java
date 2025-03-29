package neetcode._5SlidingWindow;

@SuppressWarnings("unused")
public class _1BestTimetoBuynSellStock {

    private int maxProfitBrute(int[] prices) {
        int res = 0;
        for(int i = 0; i < prices.length; i++){
            int buy = prices[i];
            for(int j = i + 1; j < prices.length; j++){
                int sell = prices[j];
                res = Math.max(res, sell - buy);
            }
        }
        return res;
    }
//TC : O(n^2)
//SC : O(1)

    private int maxProfitTwoPointer(int[] prices) {
        int l = 0, r = 1, maxP = 0;
        while(r < prices.length){
            if(prices[l] < prices[r]){
                int profit = prices[r] - prices[l];
                maxP = Math.max(maxP, profit);
            } else{
                l = r;
            }
            r++;
        }
        return maxP;
    }
//TC : O(n)
//SC : O(1)

    private int maxProfitDP(int[] prices) {
        int max = 0, minBuy = prices[0];
        for(int sell : prices){
            max = Math.max(max, sell - minBuy);
            minBuy = Math.min(sell, minBuy);
        }
        return max;
    }
}
//TC : O(n)
//SC : O(1)