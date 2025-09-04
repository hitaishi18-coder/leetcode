class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();

        StringBuffer sb = new StringBuffer(s);

        permutate(sb , 0 , result);

        return result ;
    }

    private void permutate(StringBuffer sb , int index , List<String> result)
    {
        if(index == sb.length()){
        result.add(sb.toString());
        return ;
         }

        char c = sb.charAt(index);

        if(Character.isDigit(c))
        {
           permutate(sb , index+1 , result);
        }
        else 
        {
        sb.setCharAt(index, Character.toLowerCase(c));
        permutate(sb , index+1 , result);

        sb.setCharAt(index , Character.toUpperCase(c));
        permutate(sb , index+1 , result);
      }
}
}