import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) return false;

                char open = st.pop();
                if ((open == '(' && ch != ')') ||
                    (open == '{' && ch != '}') ||
                    (open == '[' && ch != ']')) {
                    return false;
                }
            }
        }

        return st.isEmpty(); // valid if nothing left unmatched
    }
}
