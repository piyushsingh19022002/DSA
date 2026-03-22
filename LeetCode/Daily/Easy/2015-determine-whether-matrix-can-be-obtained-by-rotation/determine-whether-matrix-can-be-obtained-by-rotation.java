class Solution {
    public void rotate(int[][] mat){
        int n = mat.length;
        // transpose first
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                int temp  = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        // reverse each row
         for(int i = 0 ; i < n ; i++){
            int a = 0,b = n-1;
            while(a<b){
                int temp = mat[i][a];
                mat[i][a] = mat[i][b];
                mat[i][b] = temp; 
                a++;
                b--;
            }
        }
    }
    public boolean isEqual(int[][] mat,int[][] target){
        int n = mat.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(mat[i][j]!=target[i][j]) return false;
            }
        }
        return true;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0 ; i < 4 ; i++){
            rotate(mat);
            if(isEqual(mat,target)) return true;
        }
        return false;
    }
}