import java.util.HashMap;

class Solution {
    public int climbStairs(int n) {
        // HashMap to store already computed results (memoization)
        HashMap<Integer, Integer> hs = new HashMap<>();
        // Call the recursive function to calculate total ways
        return ways(n, hs);
    }

    // Recursive function to calculate number of ways to climb n stairs
    private int ways(int n, HashMap<Integer, Integer> hs) {
        // Base case: exactly reached the top
        if (n == 0) return 1;
        
        // Base case: overshot the top, invalid path
        if (n < 0) return 0;
        
        // If result for n steps is already calculated, return it
        if (hs.containsKey(n)) return hs.get(n);

        // Recursively calculate:
        // ways to climb if we take 1 step + ways to climb if we take 2 steps
        int ans = ways(n - 1, hs) + ways(n - 2, hs);
        
        // Store the result in HashMap for future reuse
        hs.put(n, ans);
        
        // Return total ways for n steps
        return ans;
    }
}
