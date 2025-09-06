class Solution {
    public int climbStairs(int n) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        return ways(n , hs);
    }
    private int ways(int n , HashMap<Integer, Integer> hs)
    {
        if(n == 0) return 1;
        if(n < 0) return 0;
        if(hs.containsKey(n)) return hs.get(n);

        int ans = ways(n-1 , hs) + ways(n-2 , hs);
        hs.put(n , ans);
        return ans;
    }
}