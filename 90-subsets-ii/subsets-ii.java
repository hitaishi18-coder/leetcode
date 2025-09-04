class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        subset(nums, 0 , new ArrayList<>() , result);
        return result ;
    }

    private void subset(int[] nums , int index , List<Integer> answer , List<List<Integer>> result )
    {
        result.add(new ArrayList<>(answer));
        for(int i = index; i< nums.length ; i++)
        {
            if(i > index && nums[i] == nums[i-1]) continue ;

            answer.add(nums[i]);

            subset(nums, i+1 , answer , result);

            answer.remove(answer.size()-1 );
        }
    }
}