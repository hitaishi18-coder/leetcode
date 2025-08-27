class Solution {
    public int islandPerimeter(int[][] grid) {
        int i, j, M = grid.length, N = grid[0].length;
        int count = 0; // final perimeter count

        // Traverse full grid
        for (i = 0; i <= M - 1; i++) {
            for (j = 0; j <= N - 1; j++) {
                
                // Agar water hai -> skip
                if (grid[i][j] == 0) continue;

                // Agar land hai (grid[i][j] == 1), then check its 4 sides

                // 1. Top boundary (if first row OR cell above is water)
                if (i == 0 || grid[i - 1][j] == 0) count++;

                // 2. Bottom boundary (if last row OR cell below is water)
                if (i == M - 1 || grid[i + 1][j] == 0) count++;

                // 3. Left boundary (if first col OR left cell is water)
                if (j == 0 || grid[i][j - 1] == 0) count++;

                // 4. Right boundary (if last col OR right cell is water)
                if (j == N - 1 || grid[i][j + 1] == 0) count++;
            }
        }
        return count; // final perimeter
    }
}
