class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int MOD = 12345;
        int[][] p = new int[n][m];

        long currentProduct = 1;

        // Step 1: Forward Pass (Prefix Product)
        // Har cell mein usse pehle waale saare elements ka product store karo
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                p[i][j] = (int) currentProduct;
                currentProduct = (currentProduct * (grid[i][j] % MOD)) % MOD;
            }
        }

        currentProduct = 1; // Reset for backward pass

        // Step 2: Backward Pass (Suffix Product)
        // Har cell mein uske baad waale saare elements ka product multiply karo
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                p[i][j] = (int) ((p[i][j] * currentProduct) % MOD);
                currentProduct = (currentProduct * (grid[i][j] % MOD)) % MOD;
            }
        }

        return p;
    }
}