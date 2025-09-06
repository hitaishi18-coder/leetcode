class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(nums, 0 , new ArrayList<>(), result);
        return result ;
    }

    private void backTrack(int[] nums , int index , List<Integer> answer, List<List<Integer>> result)
    {
         result.add(new ArrayList<>(answer));

    for(int i = index ; i< nums.length ; i++)
    {
        answer.add(nums[i]);  // choose 
        backTrack(nums, i+1 , answer , result); // explore 
        answer.remove(answer.size()-1) ;// backtrack
    }
    }
}