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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode first = head;
        ListNode second = head.next;
        ListNode next = second.next;

        head = second;
        second.next = first;
        first.next = next;

        ListNode prev = first;

        while(prev.next!=null && prev.next.next!=null){
            first = prev.next;
            second = prev.next.next;
            next = second.next;

            prev.next = second;
            second.next = first;
            first.next = next;

            prev = first;
        }
        return head;
    }
}