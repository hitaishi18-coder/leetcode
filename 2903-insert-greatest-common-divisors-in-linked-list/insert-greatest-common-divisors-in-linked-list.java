/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        // t1 ko list ke start par rakha (traverse karne ke liye)
        ListNode t1 = head;

        // Jab tak current node aur uska next node exist karte hain
        while (t1 != null && t1.next != null) {
            // Dono consecutive nodes ke values nikal liye
            int num1 = t1.val;
            int num2 = t1.next.val;

            // gcd nikalna hai un dono ka (helper function se)
            int gcdValue = gcd(Math.abs(num1), Math.abs(num2));

            // gcd value ke liye naya node banaya
            ListNode gcdNode = new ListNode(gcdValue);

            // gcdNode ko t1 aur t1.next ke beech insert kar diya
            gcdNode.next = t1.next;
            t1.next = gcdNode;

            // ab t1 ko aage badha diya (skip gcd node, original next par chale gaye)
            t1 = gcdNode.next;
        }
        // finally modified linked list return kar diya
        return head;
    }

    // Helper function: Euclidean Algorithm se GCD nikalna
    private int gcd(int a, int b) {
        // jab tak b 0 na ho jaye
        while (b != 0) {
            // b ko temporary store kar liya
            int tmp = b;

            // remainder nikala (a ko b se divide karke)
            b = a % b;

            // ab a ko purana b bana diya
            a = tmp;
        }
        // jab b 0 ho jata hai tab a hi gcd hota hai
        return a;
    }
}
