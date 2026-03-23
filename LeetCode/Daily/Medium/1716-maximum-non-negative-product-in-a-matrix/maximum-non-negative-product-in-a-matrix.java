class Solution {
    public int maxProductPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int MOD = 1000000007;
        long[][] maxVal = new long[m][n];
        long[][] minVal = new long[m][n];
        // first value
        maxVal[0][0] = minVal[0][0] = grid[0][0];
        // first row
        for(int j = 1 ; j < n ; j++){
            maxVal[0][j] = minVal[0][j] = grid[0][j] * maxVal[0][j-1];
        }
        // first column
        for(int i = 1 ; i < m ; i++){
            maxVal[i][0] = minVal[i][0] = grid[i][0] * maxVal[i-1][0];
        }
        //remaining
        for(int i = 1 ; i < m ; i++){
            for(int j = 1 ; j < n ; j++){
                if(grid[i][j]>=0){
                    maxVal[i][j] = Math.max(maxVal[i-1][j],maxVal[i][j-1]) * grid[i][j];
                    minVal[i][j] = Math.min(minVal[i-1][j],minVal[i][j-1]) * grid[i][j];
                }else{
                    maxVal[i][j] = Math.min(minVal[i-1][j],minVal[i][j-1]) * grid[i][j];
                    minVal[i][j] = Math.max(maxVal[i-1][j],maxVal[i][j-1]) * grid[i][j];
                }
            }
        }
        return maxVal[m-1][n-1]>=0 ? (int)(maxVal[m-1][n-1]%MOD) : -1;
    }
}