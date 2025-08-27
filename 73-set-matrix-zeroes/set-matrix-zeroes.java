class Solution {
    public void setZeroes(int[][] matrix) {
        int i , j , M = matrix.length , N = matrix[0].length;

        // Arrays to track which rows and columns should be set to 0
        boolean [] rows  = new boolean[M];
        boolean [] columns = new boolean[N];

        // Step 1: Traverse matrix to mark rows & columns containing 0
        for ( i = 0; i <= M-1; i++) {
            for ( j = 0; j <= N-1; j++) {
                if(matrix[i][j] == 0){
                    rows[i] = true;     // mark entire row
                    columns[j] = true;  // mark entire column
                }
            }
        }

        // Step 2: Traverse matrix again & set 0 where row/col is marked
        for ( i = 0; i <= M-1; i++) {
            for ( j = 0; j <= N-1; j++) {
                if(rows[i] == true  || columns[j] == true){
                    matrix[i][j] = 0; // update cell to 0
                }
            }
        }
    }
}
