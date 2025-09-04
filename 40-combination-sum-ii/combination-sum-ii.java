class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates); // remove duplicates 

        combinations(candidates , target , 0 , new ArrayList<>(), result);
        return result ;
    }

    private void combinations(int [] candidates , int target , int start , List<Integer> current , List<List<Integer>> result )
    {
        if(target == 0)
        {
            result.add(new ArrayList<> (current)) ; // store a copy 
            return ; 
        }

        for(int i = start; i<candidates.length ; i++)
        {
            if(i > start && candidates[i] == candidates[i-1]) continue ;

            if(candidates[i] > target) break;

            current.add(candidates[i]);

            combinations(candidates , target - candidates[i] , i + 1 , 
            current , result );

            current.remove(current.size()-1);
        }
    }
}