// class Solution {
//     public boolean isPalindrome(int x) {
//         if(x < 0) {
//             return false;
//         } 
//         String s = Integer.toString(x) ;

//         String rev = new StringBuffer(s).reverse().toString();

//         return s.equals(rev);
//     }
// }


class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false; // negative numbers not palindrome

        String s = Integer.toString(x); // convert to string
        String rev = ""; // empty string to store reversed value

        // reverse manually
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        return s.equals(rev); // compare both
    }
}
