// class Solution {
//     public int helper(int[] nums,int i,int[] dp) {
//         if(i>=nums.length) return 0;
//         if(dp[i]!=-1) return dp[i];
//         int take = nums[i] + helper(nums,i+2,dp);
//         int skip = helper(nums,i+1,dp);
//         return dp[i]=Math.max(take,skip);
//     }
//     public int rob(int[] nums) {
//         int[] dp = new int[nums.length+2];
//         Arrays.fill(dp,-1);
//         return helper(nums,0,dp);
//     }
// }
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[nums.length];
        if(nums.length == 1){
            return nums[0];
        }
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1] ,nums[0]);
        for(int i = 2; i<n;i++){
            dp[i] = Math.max(dp[i-2] + nums[i] , dp[i-1]);
        }
        return dp[n-1];
    }
}