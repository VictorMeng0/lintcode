package middle;

/**
 * Created by menghan on 2018/8/17.
 */
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        // write your code here
        int maxPro = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1])
                maxPro+=prices[i] - prices[i-1];
        }
        return maxPro;
    }
}
