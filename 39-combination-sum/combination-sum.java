class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        
        ways(candidates, 0 , target , new ArrayList<>() , 0 , result);
        return result ;
    }
    static void ways(int []candidates , int i , int target , List<Integer>
    answerList , int sum , List<List<Integer>> result)
    {
        if(sum == target)
        {
            result.add(new ArrayList<>(answerList));
            return ;
        }

        if(i == candidates.length || sum > target )
        {
            return ;
        }

        answerList.add(candidates[i]);

        // include 
        ways(candidates , i , target , answerList , sum+candidates[i], result );
        // no i+1 because we can use duplicates to get target value 

        answerList.remove(answerList.size()-1 ); // backtrack 

        // exclude 

        ways(candidates , i+1 , target , answerList , sum , result );
    }
}