class Solution {
    public int maxProfit(int[] prices)
    {
       int profit_today = 0 ;
       int best_profit = 0 ;
       int smallest =  prices[0] ;
      
 
       for (int i = 0 ; i <= prices.length -1  ; i++)
       {
           smallest = Math.min(prices[i] , smallest) ;
           profit_today = prices[i] - smallest ;
           best_profit = Math.max( profit_today ,best_profit);
       } 
       return best_profit ;     
    }
     

}