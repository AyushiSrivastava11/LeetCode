class Solution {
    public int maxProfit(int[] prices) {
        int costPrice = prices[0] , profit = 0,sellingPrice=0;
        for (int index = 1; index < prices.length; index++) {
            sellingPrice = prices[index];
            if( sellingPrice > costPrice){
                profit = Math.max(profit,(sellingPrice-costPrice));
            }
            else{
                costPrice = sellingPrice;
            }
        }
        return profit;
    }
}