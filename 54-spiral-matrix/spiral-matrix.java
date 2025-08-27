class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // Final result list to store spiral order elements
        List<Integer> result = new ArrayList<>();
        
        // Edge case: if matrix is empty/null return empty list
        if (matrix == null || matrix.length == 0) return result;
        
        int m = matrix.length;       // total rows
        int n = matrix[0].length;    // total cols
        
        // Four boundaries of matrix
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;
        
        // Loop until boundaries overlap
        while (top <= bottom && left <= right) {
            
            // 1. Traverse left → right on the top row
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++; // move top boundary down
            
            // 2. Traverse top → bottom on the right column
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--; // move right boundary left
            
            // 3. Traverse right → left on the bottom row (if still valid)
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--; // move bottom boundary up
            }
            
            // 4. Traverse bottom → top on the left column (if still valid)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // move left boundary right
            }
        }
        
        // return collected spiral order
        return result;
    }
}
