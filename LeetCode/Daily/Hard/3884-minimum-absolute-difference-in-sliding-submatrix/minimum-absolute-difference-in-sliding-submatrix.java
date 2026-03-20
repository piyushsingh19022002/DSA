class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int p = m-k+1;
        int q = n-k+1;
        int[][] ans = new int[p][q];
        for(int i = 0 ; i < p ;i++){
            for(int j = 0 ; j < q;j++){
                TreeSet<Integer> set = new TreeSet<>();
                for(int y = i ; y < i+k ; y++){
                    for(int z = j ; z< j+k ; z++){
                        set.add(grid[y][z]);
                    }
                }
                int minValue = Integer.MAX_VALUE;
                Integer prev = null;
                for(Integer val : set){
                    if(prev!=null){
                        minValue = Math.min(Math.abs(val - prev),minValue);
                    }
                    prev = val;
                }
                ans[i][j] = (set.size() < 2) ? 0 : minValue;
            }
        }
        return ans;
    }
}