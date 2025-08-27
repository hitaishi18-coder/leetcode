class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        // Edge case: matrix empty/null
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        } 

        int M = matrix.length;      // total rows
        int N = matrix[0].length;   // total columns

        // Start point: top-right corner
        int row = 0;       // 1st row
        int col = N - 1;   // last column
  
        // Keep searching while inside matrix boundaries
        while (row < M && col >= 0) {
            int val = matrix[row][col];  // current element

            if(val == target){
                return true; // target found
            } 
            else if (val > target){
                col--;   // move left (value too big)
            }
            else {
                row++;   // move down (value too small)
            }
        }

        // target not found
        return false; 
    }
}
