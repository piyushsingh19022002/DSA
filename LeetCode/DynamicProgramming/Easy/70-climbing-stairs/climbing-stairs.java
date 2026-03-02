// class Solution {
//     public int climbStairs(int n) {
//         return helper(0,n);
//     }
//     public int helper(int curr,int n){
//         if(curr>n) return 0;
//         if(curr==n) return 1;
//         return helper(curr+1,n) + helper(curr+2,n);
//     }
// }

class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(0,n,dp);
    }
    public int helper(int curr,int n,int[] dp){
        if(curr>n) return 0;
        if(curr==n) return 1;
        if(dp[curr]!=-1) return dp[curr];
        return dp[curr] = helper(curr+1,n,dp) + helper(curr+2,n,dp);
    }
}