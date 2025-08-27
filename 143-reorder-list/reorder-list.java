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
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        ListNode t = start;

        while(t != null)
        {
            dq.add(t.val);
            t = t.next ;
        }
        System.out.println(dq);

        int val;

        t = start ;

        while(true)
        {
            val = dq.removeFirst();
            System.out.println(val);

            t.val = val;
            t = t.next ;

            if(dq.isEmpty())
            {
                break;
            }

            val = dq.removeLast();
            System.out.println(val);

            t.val = val;
            t = t.next ;

            if(dq.isEmpty())
            {
                break;
            }
        }

    }
}