class Solution {
    public void rev(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        
        // transpose
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < i ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp; 
            }
        }
        // reverse each row
        for(int i = 0 ; i < m ; i++){
            rev(matrix[i]);
        }
    }
}