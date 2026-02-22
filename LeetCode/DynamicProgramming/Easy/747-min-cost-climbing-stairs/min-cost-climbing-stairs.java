// class Solution { // Recursion + Memoization
//     public int minCostClimbingStairs(int[] cost) {
//         int[] dp = new int[cost.length];
//         Arrays.fill(dp,-1);
//         return Math.min(helper(0,cost,dp),helper(1,cost,dp));
//     }
//     public int helper(int idx,int[] cost,int[] dp){
//         if(idx==cost.length-1||idx==cost.length-2) return cost[idx];
//         if(dp[idx]!=-1) return dp[idx];
//         return dp[idx] = cost[idx]+Math.min(helper(idx+1,cost,dp),helper(idx+2,cost,dp));
//     }
// }
class Solution { // Tabulation
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        dp[n-1] = cost[n-1]; // base case
        dp[n-2] = cost[n-2]; // base case

        for(int i = n-3; i >=0 ;i--){
            dp[i] = cost[i]+Math.min(dp[i+1],dp[i+2]);
        }
        return Math.min(dp[0],dp[1]);
    }
}