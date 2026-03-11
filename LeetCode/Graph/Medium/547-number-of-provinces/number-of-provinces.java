class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int provinces = 0;
        boolean[] isVisited = new boolean[n];
        for(int i = 0 ; i < n ;i++){
            if(!isVisited[i]){
                bfs(i,isVisited,isConnected);
                provinces++;
            }
        }
        return provinces;
    }
    public void bfs(int i ,boolean[] isVisited,int[][] isConnected){
        int n = isConnected.length;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        isVisited[i] = true;
        while(!q.isEmpty()){
            int front = q.poll();
            for(int j = 0;j < n;j++){
                if(isConnected[front][j]==1 && !isVisited[j]){
                    q.add(j);
                    isVisited[j] = true;
                }
            }
        }
    }
}