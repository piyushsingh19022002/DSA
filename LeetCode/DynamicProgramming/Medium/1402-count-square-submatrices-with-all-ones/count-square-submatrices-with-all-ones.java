class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(i==0 && j==0) count = matrix[0][0];
                else if(i==0 && matrix[i][j]==1){
                    count += matrix[i][j];
                }else if(j==0 && matrix[i][j]==1){
                    count += matrix[i][j];
                }else{
                    if(matrix[i][j]!=0){
                        int up = matrix[i-1][j];
                        int left = matrix[i][j-1];
                        int dia = matrix[i-1][j-1];
                        matrix[i][j] = Math.min(up,Math.min(left,dia))+1;
                        count += matrix[i][j];
                    }
                }
            }
        }
        return count;
    }
}