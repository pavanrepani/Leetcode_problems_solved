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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<>();
        for(ListNode head:lists){
            ListNode temp = head;
            while(temp!=null){
                list.add(temp.val);
                temp = temp.next;
            }
        }
        Collections.sort(list);
        ListNode res = new ListNode(34);
        ListNode dummy = res;
        for(int i=0;i<list.size();i++){
            ListNode cur = new ListNode(list.get(i));
            dummy.next = cur;
            dummy = dummy.next;
        }
        return res.next;
    }
}