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
    public int getDecimalValue(ListNode start) {
        
        // Step 1: pointer banaya list traverse karne ke liye
        ListNode t1 = start;  

        // Step 2: pehle list ki length count karenge (n = number of nodes)
        int n = 0;
        while(t1 != null) {
            n++;              // har node count kar li
            t1 = t1.next;     // pointer aage badhaya
        }

        // Step 3: ab sum banayenge (decimal value store karne ke liye)
        int sum = 0;
        t1 = start;  // pointer ko dobara head pe set kiya

        // Step 4: dobara list traverse karke har node ka decimal contribution add karenge
        while(t1 != null) {
            // node ki value * 2^(position) add karenge
            // position n-1 hoga isliye pehle --n likha hai
            sum = sum + t1.val * (int)Math.pow(2, --n);

            // pointer aage move karna zaroori hai warna infinite loop ban jayega
            t1 = t1.next;  
        }

        // Step 5: final decimal value return kar do
        return sum;
    }
}
