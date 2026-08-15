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
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        boolean is  = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                is = true ;
                break;
            }
        }
        if(!is) return null;
        slow = head;
        // ListNode prev = null;
        while(slow!=fast){
            slow = slow.next;
            // prev = fast;
            fast = fast.next;

        }
        return slow;
    }
}