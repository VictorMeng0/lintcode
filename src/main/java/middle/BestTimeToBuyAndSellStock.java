package middle;

/**
 * Created by menghan on 2018/8/6.
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        // write your code here
        if(prices.length<=1) return 0;
        int min = prices[0];
        int maxPro = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>=min){
                if(prices[i]-min>maxPro)
                  maxPro = prices[i]-min;
            }
            else min = prices[i];
        }
        return maxPro;
    }
}
