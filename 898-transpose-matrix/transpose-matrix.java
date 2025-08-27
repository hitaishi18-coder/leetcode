class Solution {
    public int[][] transpose(int[][] matrix) {
        int i, j, M = matrix.length, N = matrix[0].length;

        // Transpose matrix ka size hamesha (N x M) hoga
        int b[][] = new int[N][M];

        // Traverse each element of original matrix
        for (i = 0; i < M; i++) {
            for (j = 0; j < N; j++) {
                // Row → Column, Column → Row
                b[j][i] = matrix[i][j];
            }
        }

        return b; // return transposed matrix
    }
}
