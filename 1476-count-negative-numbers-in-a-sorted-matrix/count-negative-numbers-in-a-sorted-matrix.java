class Solution {
    public int countNegatives(int[][] grid) {
        int i, j, M = grid.length, N = grid[0].length;
        int count = 0; // final answer

        // Traverse whole matrix
        for (i = 0; i < M; i++) {
            for (j = 0; j < N; j++) {
                // If element is negative, increase count
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count; // return total negatives
    }
}
