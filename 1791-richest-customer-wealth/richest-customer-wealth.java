class Solution {
    public int maximumWealth(int[][] accounts) {
        int i , j , M = accounts.length , N = accounts[0].length;
        int value = 0; // ab tak ka maximum wealth store karega

        // Har customer ke liye (row wise)
        for ( i = 0; i < M; i++) {
            int sum = 0; // is customer ki total wealth

            // Har account ka paisa add karo
            for ( j = 0; j < N ; j++) {
                sum += accounts[i][j];
            }

            // Agar is customer ki wealth sabse zyada hai to update karo
            if(sum > value){
                value = sum;
            }
        }

        // Sabse rich customer ki wealth return karo
        return value;
    }
}
