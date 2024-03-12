class Solution {
    public int maxProfit(int[] prices) 
    {
     int profit=0,start=0;
     for(int end=1;end<prices.length;end++)
     {
        if(prices[start]<prices[end])
        {
            profit+=prices[end]-prices[start];
        }
        start=end;
     }
     return profit;
    }
}