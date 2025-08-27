class Solution {
    public void rotate(int[][] matrix) {
        // Step 1: Transpose the original matrix
        int b[][] = transpose(matrix);

        // Step 2: Mirror (reverse each row horizontally)
        int c [][] = mirror(b);

        // Step 3: Copy back the rotated matrix into original 'matrix'
        int i , j , M = matrix.length , N = matrix[0].length;
        for ( i = 0; i < M; i++) {
            for ( j = 0; j < N ; j++) {
                matrix[i][j] = c[i][j]; // update original matrix
            }
        }
    }

    // Function to find transpose of matrix
    static int[][] transpose (int matrix[][]){
        int i , j , M = matrix.length , N = matrix[0].length;
        // Transposed matrix will have dimensions N x M
        int b[][] = new int [N] [M];

        for ( i = 0; i < M; i++) {
            for ( j = 0; j < N; j++) {
                // Swap rows with columns
                b[j][i] = matrix[i][j];
            }
        }
        return b; // return the transposed matrix
    }

    // Function to mirror (reverse each row) of matrix
    static int[][] mirror(int matrix[][]){
        int M = matrix.length , N = matrix[0].length;
        int b[] [] = new int [M] [N]; // new matrix for mirrored result

        for (int  i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                // Place element at mirrored position (reverse horizontally)
                b[i][N-1-j] = matrix[i][j];
            }
        }
        return b; // return mirrored matrix
    }
}
