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
    public boolean isPalindrome(ListNode start) {
        // Edge cases: agar 0 ya 1 node hai to list hamesha palindrome hogi
        if (start == null || start.next == null) return true;

        // Step 1: Find middle using slow (t1) and fast (t2) pointers
        ListNode t1 = start; // slow pointer
        ListNode t2 = start; // fast pointer
        while (t2 != null && t2.next != null) {
            t1 = t1.next;        // slow -> 1 step
            t2 = t2.next.next;   // fast -> 2 step
        }
        // Jab loop khatam hoga, t1 middle par hoga

        // Step 2: Reverse second half of list (starting from middle)
        ListNode halfTwo = reverseList(t1);

        // Step 3: Compare first half and reversed second half
        ListNode halfFirst = start;
        while (halfTwo != null) {
            if (halfTwo.val != halfFirst.val) {
                return false; // agar koi mismatch mila to palindrome nahi hai
            }
            // dono pointers ko aage badhao
            halfFirst = halfFirst.next;
            halfTwo = halfTwo.next;
        }

        return true; // agar sab match ho gaye to palindrome hai
    }

    // Helper function: reverse a linked list and return new head
    private ListNode reverseList(ListNode t) {
        ListNode start2 = null; // yeh reversed list ka naya head banega

        while (t != null) {
            // Pehle next node ko store karo (warna list ka aage ka part kho jaayega)
            ListNode nextNode = t.next;

            // Current node ka link ulta karo
            t.next = start2;

            // Move "start2" ko current node pe (update reversed head)
            start2 = t;

            // Original list me aage badho
            t = nextNode;
        }

        return start2; // reversed list ka head return karo
    }
}
