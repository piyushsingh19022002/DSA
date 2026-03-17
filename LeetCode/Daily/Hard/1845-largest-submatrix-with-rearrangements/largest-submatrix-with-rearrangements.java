class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int maxArea = 0;
        for(int i = 1 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(matrix[i][j]==1) matrix[i][j] += matrix[i-1][j]; 
            }
        }
        for(int i = 0 ; i < m ; i++){
            int[] clone = matrix[i].clone();
            Arrays.sort(clone);
            int width = 1;
            for(int j = n-1 ; j >= 0 ; j--){
                int currArea = width++ * clone[j];
                maxArea = Math.max(currArea,maxArea);
            }
        }
        return maxArea;
    }
}