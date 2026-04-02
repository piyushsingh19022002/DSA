class Solution {
    public int maximumAmount(int[][] coins) {
        int m = coins.length;
        int n = coins[0].length;
        
        // dp[i][j][k] -> max coins at (i,j) with k robberies/powers used
        int[][][] dp = new int[m][n][3];

        // Initialize with a very small value
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 3; k++) dp[i][j][k] = Integer.MIN_VALUE;
            }
        }

        // Base case: Starting point (0,0)
        dp[0][0][0] = coins[0][0]; // No power used
        dp[0][0][1] = Math.max(0, coins[0][0]); // 1 power used (neutralize if negative)
        dp[0][0][2] = Math.max(0, coins[0][0]); // 2 powers used (though usually 1 is enough for one cell)

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 3; k++) {
                    if (dp[i][j][k] == Integer.MIN_VALUE) continue;

                    // Move Right
                    if (j + 1 < n) {
                        update(dp, i, j + 1, k, dp[i][j][k], coins[i][j + 1]);
                    }
                    // Move Down
                    if (i + 1 < m) {
                        update(dp, i + 1, j, k, dp[i][j][k], coins[i + 1][j]);
                    }
                }
            }
        }

        return Math.max(dp[m - 1][n - 1][0], Math.max(dp[m - 1][n - 1][1], dp[m - 1][n - 1][2]));
    }

    private void update(int[][][] dp, int r, int c, int k, int currentSum, int nextVal) {
        // Option 1: Don't use a power on the next cell
        dp[r][c][k] = Math.max(dp[r][c][k], currentSum + nextVal);

        // Option 2: Use a power on the next cell (if powers are left)
        if (k + 1 < 3) {
            dp[r][c][k + 1] = Math.max(dp[r][c][k + 1], currentSum + Math.max(0, nextVal));
        }
    }
}