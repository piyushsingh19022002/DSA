class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        long[] rowSum = new long[m];
        long[] colSum = new long[n];
        long total = 0;

        // Compute sums
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i] += grid[i][j];
                colSum[j] += grid[i][j];
                total += grid[i][j];
            }
        }

        if (total % 2 != 0) return false;

        if (check(rowSum, total)) return true;
        if (check(colSum, total)) return true;

        return false;
    }

    private boolean check(long[] arr, long total) {
        long uptoNow = arr[0];
        long remaining = total - uptoNow;

        for (int i = 1; i < arr.length; i++) {
            if (uptoNow == remaining) return true;
            else if (uptoNow > remaining) return false;
            uptoNow += arr[i];
            remaining -= arr[i];
        }

        return false;
    }
}