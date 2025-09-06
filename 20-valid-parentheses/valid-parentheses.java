import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        Deque<Character> dq = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                dq.push(ch); // push opening bracket
            } else {
                if (dq.isEmpty()) return false; // no match available

                char open = dq.pop();
                if ((open == '(' && ch != ')') ||
                    (open == '{' && ch != '}') ||
                    (open == '[' && ch != ']')) {
                    return false; // mismatched
                }
            }
        }

        return dq.isEmpty(); // valid only if all matched
    }
}
