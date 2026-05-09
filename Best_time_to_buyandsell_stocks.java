class Best_time_to_buyandsell_stocks{
    public int maxProfit(int[] prices) {
        int minval= Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        if(prices[i]<minval){
            minval=prices[i];
        }
        else{
            int profit=prices[i]-minval;
            if(profit>maxprofit){
                maxprofit=profit;
            }
        }
        return maxprofit;
    }
}