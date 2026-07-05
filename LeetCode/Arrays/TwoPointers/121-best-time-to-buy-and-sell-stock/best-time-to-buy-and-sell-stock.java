class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxd = 0;
        int min = prices[0];
        for(int i = 1 ; i < n ; i++){
            if(prices[i]>min){
                maxd = Math.max(prices[i]-min,maxd);
            }else{
                min = prices[i];
            }
        }
        return maxd;
    }
}