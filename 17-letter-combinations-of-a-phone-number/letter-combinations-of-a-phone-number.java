class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0) return result ;
        
        Map<Character , String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        backTrack(digits , 0 , new StringBuffer() , result , map);
        return result ; 
    }
    static void backTrack(String digits , int i , StringBuffer answer , 
    List<String> result , Map<Character,String> map )
    {
        if(i == digits.length())
        {
            result.add(answer.toString());
            return ;
        }

        String letters = map.get(digits.charAt(i));
        for(char ch : letters.toCharArray())
        {
            answer.append(ch); //choose
            backTrack(digits, i+1 , answer, result , map);
            answer.deleteCharAt(answer.length()-1 );   // remove 
        }
    }
}