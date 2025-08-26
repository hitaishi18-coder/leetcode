/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode start) {
        if(start == null ||  start.next == null )
        {
            // do nothing 
            return false ;
        }
            ListNode t1 ;  // slow 
            ListNode t2 ;  // fast 
            t1 = start ;
            t2 = start ;
        
        while(t2 != null && t2.next != null)
        {
            t1 = t1.next ;  // move one step 
            t2 = t2.next.next ; // move two steps 

            if(t1 == t2 )
            {
                return true ;
            }
        }
        return false ;
    }
    }
