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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        int n = list.size();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = list.get(i);
        }
        int l = left-1,r=right-1;
        while(l<r){
            int tem = ar[l];
            ar[l] = ar[r];
            ar[r] = tem;
            l++;
            r--;
        }
        // for(int x:ar){
        //     System.out.print(x+" ");
        // }
        ListNode res = new ListNode(3);
        ListNode ans = res;
        for(int i=0;i<n;i++){
            res.next = new ListNode(ar[i]);
            res = res.next;
        }
        return ans.next;
    }
}