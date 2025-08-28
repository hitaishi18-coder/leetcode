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
        // t1 se list traverse karenge
        ListNode t1 = head;

        while (t1 != null && t1.next != null) {
            int num1 = t1.val;
            int num2 = t1.next.val;

            // compute gcd using helper function
            int gcdValue = gcd(Math.abs(num1), Math.abs(num2));

            // create new node with gcd and insert between t1 and t1.next
            ListNode gcdNode = new ListNode(gcdValue);
            gcdNode.next = t1.next;
            t1.next = gcdNode;

            // move t1 two steps forward (skip the inserted node)
            t1 = gcdNode.next;
        }
        return head;
    }

    // Helper: iterative gcd (Euclidean algorithm)
    private int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}
