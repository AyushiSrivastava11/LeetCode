class Solution {
    public int maxProfit(int[] prices) 
    {
      int profit=0,cost_price=prices[0];
      for(int index=1;index<prices.length;index++)
      {
          int selling_price=prices[index];
          if(selling_price > cost_price)
          {
              profit=Math.max(profit, selling_price-cost_price);
          }
          else
          {
              cost_price=selling_price;
          }
      }   
      return profit;
    }
}