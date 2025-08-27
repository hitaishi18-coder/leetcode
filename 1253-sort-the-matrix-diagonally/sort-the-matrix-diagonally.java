class Solution {
    public int[][] diagonalSort(int[][] a) {
        int i, j,
        M = a.length,       // total rows
        N = a[0].length;    // total cols

        // Map to store each diagonal separately
        // Key = (i - j), Value = Min-Heap (PriorityQueue) of elements in that diagonal
        Map<Integer, PriorityQueue<Integer>> pq = new HashMap<>();
        
        // Step 1: Group elements by diagonals (i - j is constant for each diagonal)
        for (i = 0; i <= M - 1; i++) {
            for (j = 0; j <= N - 1; j++) {
                pq.putIfAbsent(i - j, new PriorityQueue<>()); // new PQ if diagonal not present
                pq.get(i - j).add(a[i][j]); // add element into its diagonal heap
            }
        }

        // Step 2: Place back sorted values into matrix
        for (i = 0; i <= M - 1; i++) {
            for (j = 0; j <= N - 1; j++) {
                a[i][j] = pq.get(i - j).poll(); // poll gives smallest (sorted) element
            }
        }

        return a; // return sorted matrix
    }
}
