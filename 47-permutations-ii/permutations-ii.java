import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // sort for duplicates
        boolean[] visited = new boolean[nums.length];
        permute(nums, visited, new ArrayList<>(), result);
        return result;
    }

    private void permute(int[] nums, boolean[] visited, List<Integer> answer, List<List<Integer>> result) {
        // Base case: permutation complete
        if (answer.size() == nums.length) {
            result.add(new ArrayList<>(answer));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // Skip if already used
            if (visited[i]) continue;

            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;

            // Include nums[i]
            answer.add(nums[i]);
            visited[i] = true;

            // Recurse
            permute(nums, visited, answer, result);

            // Backtrack
            answer.remove(answer.size() - 1);
            visited[i] = false;
        }
    }
}
