class Solution {
    public void swap(int[] arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int minSwaps(int[][] grid) {
        int totalSwaps = 0;
        int n = grid[0].length;
        int[] endZeros = new int[n];
        for(int i = 0; i < n; i++){
            int zeroCount = 0;
            for(int j = n-1; j >= 0; j--){
                if(grid[i][j] == 0) zeroCount++;
                else{
                    break;
                }
            }
            endZeros[i] = zeroCount; // works for both cases
        }   
        for(int i = 0 ; i < n;i++){
            int zerosRequired = n - i - 1; // zeros required for current row
            if(endZeros[i]>=zerosRequired) continue;
            else{
                int targetPos = -1;
                for(int j = i+1 ; j <n;j++){
                    if(endZeros[j]>=zerosRequired){
                        targetPos = j;
                        totalSwaps+=(j-i);
                        break;
                    }
                }
                if(targetPos==-1) return -1;
                for(int k = targetPos;k>i;k--){
                    swap(endZeros,k,k-1);
                }
            }
        }
        return totalSwaps;
    }
}