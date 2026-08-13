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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp = head;
        ListNode left = new ListNode(4);
        ListNode lef = left;
        ListNode right = new ListNode(3);
        ListNode rig = right;
        int i=0;
        while(head!=null){
            if(i%2==0){
                ListNode nn = new ListNode(head.val);
                left.next = nn;
                left = left.next;
            }else{
                ListNode cur = new ListNode(head.val);
                right.next = cur;
                right = right.next;
            }
            i++;
            head = head.next;
        }
        left.next = rig.next;

        return lef.next;
    }
}