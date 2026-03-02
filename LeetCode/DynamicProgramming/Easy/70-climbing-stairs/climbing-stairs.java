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

// class Solution { // top - down
//     public int climbStairs(int n) {
//         int[] dp = new int[n+1];
//         Arrays.fill(dp,-1);
//         return helper(0,n,dp);
//     }
//     public int helper(int curr,int n,int[] dp){
//         if(curr>n) return 0;
//         if(curr==n) return 1;
//         if(dp[curr]!=-1) return dp[curr];
//         return dp[curr] = helper(curr+1,n,dp) + helper(curr+2,n,dp);
//     }
// }

class Solution { // top - down
    public int climbStairs(int n) {
        int[] dp = new int[n+2];
        dp[n+1] = 0;
        dp[n] = 1;
        for(int i = n-1 ; i >=0 ;i--){
            dp[i] = dp[i+1] + dp[i+2];
        }
        return dp[0];
    }
}