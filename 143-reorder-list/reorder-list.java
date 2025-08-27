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
    public void reorderList(ListNode start) {
        // ArrayDeque use kiya hai jisme values ko store karenge
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        ListNode t = start;

        // Step 1: Linked list ke saare values deque me daal do
        while(t != null)
        {
            dq.add(t.val);
            t = t.next ;
        }
        System.out.println(dq); // Debugging ke liye print kar raha hai

        int val;
        t = start ; // pointer firse head pe le aaya

        // Step 2: deque se ek ek karke first aur last element nikaalte jao
        while(true)
        {
            // pehle first element lo
            val = dq.removeFirst();
            System.out.println(val);
            t.val = val;  // current node me assign karo
            t = t.next ;

            // agar deque khali ho gaya toh ruk jao
            if(dq.isEmpty())
            {
                break;
            }

            // ab last element lo
            val = dq.removeLast();
            System.out.println(val);
            t.val = val;  // current node me assign karo
            t = t.next ;

            // agar deque khali ho gaya toh ruk jao
            if(dq.isEmpty())
            {
                break;
            }
        }
    }
}
