class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int M = mat.length, N = mat[0].length;

        int k = 0; // index for result array
        int b[] = new int[M * N]; // final traversal array

        int i = 0, j = 0; // start from top-left corner

        while (k < M * N) {
            // 1. Go UP-RIGHT along diagonal
            while (i >= 0 && j < N) {
                b[k++] = mat[i][j]; // store element
                i--; // move up
                j++; // move right
            }

            // Adjust position after crossing boundary
            if (j >= N) {   // went past last column
                i += 2;     // move down 2 steps
                j = N - 1;  // fix column to last col
            } else {        // went past first row
                i = 0;      // reset row to 0
            }

            // If all elements covered → exit
            if (k >= M * N)
                break;

            // 2. Go DOWN-LEFT along diagonal
            while (i < M && j >= 0) {
                b[k++] = mat[i][j]; // store element
                i++; // move down
                j--; // move left
            }

            // Adjust position after crossing boundary
            if (i >= M) {   // went past last row
                j += 2;     // move right 2 steps
                i = M - 1;  // fix row to last row
            } else {        // went past first column
                j = 0;      // reset col to 0
            }
        }
        return b; // final diagonal traversal
    }
}
