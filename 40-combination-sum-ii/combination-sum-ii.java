class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Array ko sort karte hain
        // Taaki duplicates ek saath aa jayein (easy to skip)
        Arrays.sort(candidates); 

        // Step 2: Backtracking function call karte hain
        combinations(candidates , target , 0 , new ArrayList<>(), result);
        return result ;
    }

    private void combinations(int [] candidates , int target , int start , 
                              List<Integer> current , List<List<Integer>> result )
    {
        // Base case: agar target 0 ho gaya => ek valid combination mila
        if(target == 0)
        {
            // current list ka copy banake result me daal do
            result.add(new ArrayList<> (current)) ; 
            return ; 
        }

        // Loop: har element ko consider karenge start index se
        for(int i = start; i<candidates.length ; i++)
        {
            //  Duplicate skip karne ka logic:
            // Agar current element same hai pichle element jaisa
            // aur hum same recursion level par hain (i > start)
            // toh isko skip kar do (warna duplicate combination banega)
            if(i > start && candidates[i] == candidates[i-1]) continue ;

            // Agar current element target se bada hai
            // toh aage wale aur bhi bade honge (sorted array hai) => break
            if(candidates[i] > target) break;

            // Current element ko choose karo
            current.add(candidates[i]);

            // Recursion call: target ko reduce karo
            // aur index aage badha do (i+1 -> ek element ek hi baar use ho sakta hai)
            combinations(candidates , target - candidates[i] , i + 1 , current , result );

            // Backtrack: jo element add kiya tha usko remove kar do
            // taaki next option try kar sakein
            current.remove(current.size()-1);
        }
    }
}
