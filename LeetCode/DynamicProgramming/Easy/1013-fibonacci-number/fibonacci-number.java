// Iterative Solu
// class Solution {
//     public int fib(int n) {
//         if(n<=1) return n;
//         int cur = 0;
//         int prev1 = 1;
//         int prev2 = 0;
//         for(int i = 2;i<=n;i++){
//             cur = prev1 + prev2;
//             prev2 = prev1;
//             prev1 = cur;
//         }
//         return cur;
//     }
// }
// // DP Solu
// class Solution {
//     static int[] dp;
//     public int fib(int n) {
//         dp = new int[n+1];
//         return helper(n);
//     }
//     public int helper(int n){
//         if(n<=1) return n;
//         if(dp[n]!=0) return dp[n]; // check if we had ans or not
//         int ans = helper(n-1)+helper(n-2);
//         dp[n] = ans;
//         return ans;
//     }
// }
// Recursive solu;
class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int ans = fib(n-1)+fib(n-2);
        return ans;
    }
}