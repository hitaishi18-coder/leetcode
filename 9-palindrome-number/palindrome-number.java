class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        } 
        String s = Integer.toString(x) ;

        String rev = new StringBuffer(s).reverse().toString();

        return s.equals(rev);
    }
}