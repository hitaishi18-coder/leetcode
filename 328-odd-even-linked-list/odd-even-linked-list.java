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
    public ListNode oddEvenList(ListNode start) {
         if(start == null || start.next == null ) return start ;

         ListNode odd = start ;
         ListNode even = start.next;

         ListNode evenStart = even;

         while(odd.next != null && even.next != null)
         {
            odd.next = even.next ;
            odd = odd.next;

            even.next = odd.next;
            even = even.next; 
         }

         odd.next = evenStart;

         return start;
    }
}