class Solution {
    public int maxProfit(int[] prices) {
        int rightmax = prices[prices.length -1];
        int maxprofit =0;
        for(int i=prices.length -1; i>=0; i--){
            int profit = rightmax - prices[i];
            maxprofit = Math.max(maxprofit, profit);
            rightmax = Math.max(rightmax, prices[i]);
        }
        return maxprofit;
    }
}
