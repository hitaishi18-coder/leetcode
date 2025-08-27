class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        // Edge case: if matrix is null or empty
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int M = matrix.length;      // total rows
        int N = matrix[0].length;   // total cols

        // Binary search across "flattened" matrix
        int left = 0;
        int right = M * N - 1;  // last index in 1D representation

        while (left <= right) {
            // find middle index
            int mid = (left + right) / 2;

            // convert 1D index 'mid' to 2D indices
            int row = mid / N;   // row number
            int col = mid % N;   // column number

            int val = matrix[row][col];  // value at (row, col)

            if (val == target) {
                return true; // target mil gaya
            } 
            else if (val < target) {
                left = mid + 1;  // target right side me hoga
            } 
            else {
                right = mid - 1; // target left side me hoga
            }
        }

        // agar loop khatam ho gaya -> target nahi mila
        return false;
    }
}
