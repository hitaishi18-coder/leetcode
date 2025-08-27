class Solution {
    public int[][] generateMatrix(int n) {
        int[][] a = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int k = 1;

        while (top <= bottom && left <= right) {
            // Go right
            for (int j = left; j <= right; j++) {
                a[top][j] = k++;
            }
            top++;

            // Go down
            for (int i = top; i <= bottom; i++) {
                a[i][right] = k++;
            }
            right--;

            // Go left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    a[bottom][j] = k++;
                }
                bottom--;
            }

            // Go up
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    a[i][left] = k++;
                }
                left++;
            }
        }

        return a;
    }
    }
