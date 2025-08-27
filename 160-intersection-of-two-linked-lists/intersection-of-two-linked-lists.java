/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode start1, ListNode start2) {
        // Agar koi bhi list empty hai, toh intersection possible hi nahi
        if(start1 == null || start2 == null) return null;

        // t1 pointer pehle list1 traverse karega
        // t2 pointer pehle list2 traverse karega
        ListNode t1 = start1;
        ListNode t2 = start2;

        // Jab tak dono pointers same node pe nahi mil jaate
        while(t1 != t2)
        {
            // Agar t1 null pe pahunch gaya (list1 khatam ho gayi),
            // toh use list2 ke start pe bhej do
            // warna normal next node pe move karo
            t1 = (t1 == null ) ? start2 : t1.next ;

            // Agar t2 null pe pahunch gaya (list2 khatam ho gayi),
            // toh use list1 ke start pe bhej do
            // warna normal next node pe move karo
            t2 = (t2 == null ) ? start1 : t2.next;
        }

        // Yahaan dono ek sath ya toh intersecting node pe milenge
        // ya phir null pe (agar intersection exist nahi karta)
        return t1; 
    }
}
