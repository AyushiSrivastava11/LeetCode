class Solution {
    public int maxProfit(int[] prices) {
        int cost_price = prices[0], profit = 0;
        for(int index = 1; index<prices.length;index++){
            int cost = prices[index] - cost_price;
            profit = Math.max(profit,cost);
            cost_price = Math.min(cost_price , prices[index]); 
        }
        return profit;
    }
}