class Solution {
    public boolean isPalindrome(String s) {
         s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuffer sb = new StringBuffer(s);

         sb.reverse();

         String rev = sb.toString();

         if(s.equals(rev)){
            return true ;
         } else {
            return false ;
         }

    }
}