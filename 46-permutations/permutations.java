class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        permute(result , nums, new ArrayList() , visited);
        return result;
    }

    void permute(List<List<Integer>> result , int [] nums, List<Integer> current , boolean[] visited  )
    {
       // Base case: agar current list ka size nums array ke barabar hai
if(current.size() == nums.length) {
    // current me jo permutation ready hai, usko result me add karo
    result.add(new ArrayList(current));
    return; // recursion se wapas aao
}

// Loop karke har element ko try karo
for(int i = 0; i < nums.length; i++) {
    // Agar ye element pehle hi use ho chuka hai, skip kar do
    if(visited[i] == true) continue;

    // Step 1: element ko current permutation me add karo
    current.add(nums[i]);
    // Step 2: element ko visited mark karo
    visited[i] = true;

    // Step 3: recursion call karo baaki elements ke liye
    permute(result, nums, current, visited);

    // Step 4: Backtrack → last element remove karo aur visited reset karo
    current.remove(current.size() - 1);
    visited[i] = false;
}

    }
}