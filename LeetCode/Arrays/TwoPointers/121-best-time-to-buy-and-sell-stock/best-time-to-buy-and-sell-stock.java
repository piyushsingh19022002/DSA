class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int currMin = prices[0];

        for(int i = 1; i < n ; i++){
            if(currMin>prices[i]){
                currMin = prices[i];
            }
            maxProfit = Math.max(maxProfit,prices[i]-currMin);
        }
        return maxProfit;
    }
}