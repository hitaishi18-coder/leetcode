class Solution {
    public void rotate(int[][] matrix) {
                int b[][] = transpose(matrix);
        int c [][] = mirror(b);
        int i , j , M = matrix.length , N = matrix[0].length;
        for ( i = 0; i < M; i++) {
          for ( j = 0; j < N ; j++) {
              matrix[i][j] = c[i][j];
          }
        }
    }

    static int[][] transpose (int matrix[][]){
        int i , j , M = matrix.length , N = matrix[0].length;
        int b[][] = new int [N] [M];

        for ( i = 0; i < M; i++) {
            for ( j = 0; j < N; j++) {
                b[j][i] = matrix[i][j];

            }
        }
        return b;
    }


    static int[][] mirror(int matrix[][]){
        int M = matrix.length , N = matrix[0].length;

        int b[] [] = new int [M] [N];

        for (int  i = 0; i < M; i++) {

            for (int j = 0; j < N; j++) {
                b[i][N-1-j] = matrix[i][j];
            }
            
        }
        return b;
    }
    }
