class Solution { // top down
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int[] dp1 = new int[n];
        dp1[0] = nums[0];
        dp1[1] = Math.max(nums[0],nums[1]);
        int[] dp2 = new int[n];
        dp2[1] = nums[1];
        dp2[2] = Math.max(nums[1],nums[2]);
        for(int i = 2;i <=n-2;i++){
            dp1[i]=Math.max(nums[i]+dp1[i-2],dp1[i-1]);
        }
        for(int i = 3;i <=n-1;i++){
            dp2[i]=Math.max(nums[i]+dp2[i-2],dp2[i-1]);
        }
        return Math.max(dp1[n-2],dp2[n-1]);
    }
}
// class Solution { // top down
//     public int rob(int[] nums) {
//         int n = nums.length;
//         if(n==1) return nums[0];
//         int[] dp1 = new int[n];
//         int[] dp2 = new int[n];
//         Arrays.fill(dp1,-1);
//         Arrays.fill(dp2,-1);
//         return Math.max(helper(1,n-1,nums,dp1),helper(0,n-2,nums,dp2));
//     }
//     public int helper(int start,int end,int[] nums,int[] dp){
//         if(start>end) return 0;
//         if(dp[start]!=-1) return dp[start];
//         int take = nums[start] + helper(start+2,end,nums,dp);
//         int skip = helper(start+1,end,nums,dp);
//         return dp[start] = Math.max(take,skip);
//     }
// }
// class Solution { // recursion
//     public int rob(int[] nums) {
//         int n = nums.length;
//         if(n==1) return nums[0];
//         return Math.max(helper(1,n-1,nums),helper(0,n-2,nums));
//     }
//     public int helper(int start,int end,int[] nums,int[] dp){
//         if(start>end) return 0;
//         int take = nums[start] + helper(start+2,end,nums);
//         int skip = helper(start+1,end,nums);
//         return Math.max(take,skip);
//     }
// }