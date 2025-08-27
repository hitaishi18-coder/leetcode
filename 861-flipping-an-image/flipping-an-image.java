class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int M = image.length , N = image[0].length;

        // Process each row one by one
        for(int i = 0 ; i < M ; i++) {
            int start = 0;       // left pointer
            int end = N - 1;     // right pointer

            // Flip horizontally + Invert bits simultaneously
            while (start <= end) {
                
                // Step 1: Invert left value first (XOR with 1 flips 0↔1)
                int t = image[i][start] ^ 1;  

                // Step 2: Replace left position with inverted right value
                image[i][start] = image[i][end] ^ 1;

                // Step 3: Replace right position with previously inverted left value
                image[i][end] = t;

                // Move pointers inward
                start++;
                end--; 
            }
        }

        return image; // return the final flipped+inverted image
    }
}
