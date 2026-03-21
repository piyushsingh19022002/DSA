class Solution {
    public void swap(int[][] arr, int r1, int c1, int r2, int c2) {
        int temp = arr[r1][c1];
        arr[r1][c1] = arr[r2][c2];
        arr[r2][c2] = temp;
    }

    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        // Sirf k/2 rows tak loop chalana hai swap karne ke liye
        for (int i = 0; i < k / 2; i++) {
            for (int j = y; j < y + k; j++) {
                // Row 1: x + i
                // Row 2: (x + k - 1) - i  <-- Neeche wali row piche aayegi
                swap(grid, x + i, j, x + k - 1 - i, j);
            }
        }
        return grid;
    }
}