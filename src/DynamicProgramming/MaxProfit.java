package DynamicProgramming;

public class MaxProfit {
	
	public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int min = prices[0];
        int maxprofit = 0;
        
        for(int i = 1; i<prices.length; i++){
            if(prices[i] - min > maxprofit){
                maxprofit = prices[i] - min;
            }
            
            if(prices[i] < min){
                min = prices[i];
            }
            
            
        }
        return maxprofit;
        
        
        
    }

}
