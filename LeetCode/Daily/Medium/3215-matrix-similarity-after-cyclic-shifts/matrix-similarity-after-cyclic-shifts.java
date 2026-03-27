class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] cpy = new int[m][n];
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
               cpy[i][j] = mat[i][j];
            }
        }
        for(int f = 0 ; f < k ; f++){
            for(int i = 0 ; i < m ; i++){
                if(i%2==0){
                    rev(cpy,i,1,n-1);
                    rev(cpy,i,0,n-1);
                }else{
                    rev(cpy,i,0,n-1);
                    rev(cpy,i,1,n-1);
                }
            }
        }
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
               if(cpy[i][j] != mat[i][j]) return false;
            }
        }
        return true;
    }
    public void rev(int[][] arr,int rowNo,int s,int e){
        while(s<e){
            int temp = arr[rowNo][s];
            arr[rowNo][s] = arr[rowNo][e];
            arr[rowNo][e] = temp;
            s++;
            e--;
        }
    }
}