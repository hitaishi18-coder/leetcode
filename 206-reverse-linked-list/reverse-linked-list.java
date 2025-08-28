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
    public ListNode reverseList(ListNode start) {
        ListNode start2 = null ;
        ListNode t = start;

        while(t != null )
        {
            int num = t.val ; // take the value of node 

            ListNode nd = new ListNode(num); // create a new node 
            nd.next = start2 ; // insert in front 
            start2 = nd ;
            t = t.next ;
        }
        return start2 ;
    }
}