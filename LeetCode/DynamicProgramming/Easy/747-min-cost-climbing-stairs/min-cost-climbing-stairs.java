class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(helper(0,cost,dp),helper(1,cost,dp));
    }
    public int helper(int idx,int[] cost,int[] dp){
        if(idx==cost.length-1||idx==cost.length-2) return cost[idx];
        if(dp[idx]!=-1) return dp[idx];
        return dp[idx] = cost[idx]+Math.min(helper(idx+1,cost,dp),helper(idx+2,cost,dp));
    }
}