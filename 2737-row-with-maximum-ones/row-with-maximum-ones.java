class Solution {
    public int[] rowAndMaximumOnes(int[][] a) {
        int M = a.length, N = a[0].length;

        int rowIndex = 0; // jis row me max ones hai uska index
        int maxOnes = 0;  // ab tak ke max ones ki count

        // Har row ke liye
        for (int i = 0; i < M; i++) {
            int count = 0; // is row me ones ki count

            // Har column ke liye
            for (int j = 0; j < N; j++) {
                if (a[i][j] == 1) { 
                    count++; // agar 1 mila to count badhao
                }
            }

            // Agar is row ke ones max se zyada hai, to update karo
            if (count > maxOnes) {
                maxOnes = count; 
                rowIndex = i;   // row index bhi update karo
            }
        }

        // Output me [rowIndex, maxOnes] return karo
        return new int [] {rowIndex, maxOnes};
    }
}
