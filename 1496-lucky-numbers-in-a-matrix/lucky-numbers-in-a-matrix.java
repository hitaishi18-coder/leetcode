class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        // Edge case: agar matrix khali ho to empty list return karo
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return result;
        }

        int M = matrix.length;     // total rows
        int N = matrix[0].length;  // total columns

        // Har row ke liye check karna hai
        for(int i = 0; i < M; i++){

            // Step 1: Row ka minimum find karo
            int minimumValue = matrix[i][0]; // maan lo pehla element min hai
            int minimumColumn = 0;           // uska column index store karo

            for(int j = 1; j < N; j++){
                if(matrix[i][j] < minimumValue){
                    minimumValue = matrix[i][j];
                    minimumColumn = j; // minimum element jis column me mila
                }
            }

            // Step 2: Ab check karo ki kya yeh column me maximum hai
            boolean isLucky = true;
            for(int r = 0; r < M; r++){
                // agar column me koi aur element isse bada hai, to yeh lucky nahi
                if(matrix[r][minimumColumn] > minimumValue){
                    isLucky = false;
                    break;
                }
            }

            // Step 3: Agar row min == column max hai to lucky number hai
            if(isLucky){
                result.add(minimumValue);
            }
        }

        return result; // saare lucky numbers ki list
    }
}
