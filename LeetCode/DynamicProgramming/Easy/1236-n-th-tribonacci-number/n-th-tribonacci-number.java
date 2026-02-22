// class Solution { // Recursion + Memoization
//     public int tribonacci(int n) {
//         int[] dp = new int[n+1];
//         Arrays.fill(dp,-1);
//         return helper(n,dp);
//     }
//     public int helper(int n,int[] dp){
//         if(n<=1) return n;
//         if(n==2) return 1;
//         if(dp[n]!=-1) return dp[n];
//         return dp[n] = helper(n-1,dp)+helper(n-2,dp)+helper(n-3,dp);
//     }
// }
class Solution { // Iteration + Memoization = Tabulation
    public int tribonacci(int n) {
        if(n<=1) return n;
        if(n==2) return 1;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for(int i = 3 ; i <= n ; i++){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
}