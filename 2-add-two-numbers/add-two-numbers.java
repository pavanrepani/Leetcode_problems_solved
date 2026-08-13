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
import java.math.*;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb = new StringBuilder();
        ListNode first = l1;
        while(first!=null){
            sb.append(first.val);
            first = first.next;
        }
        StringBuilder sb2 = new StringBuilder();
        ListNode second = l2;
        while(second!=null){
            sb2.append(second.val);
            second = second.next;
        }
        BigInteger fnum = new BigInteger(sb.reverse().toString());
        BigInteger snum = new BigInteger(sb2.reverse().toString());
        BigInteger sum = fnum.add(snum);
        // System.out.println(n);
        ListNode ans = new ListNode(9);
        ListNode temp = ans;
        String s = sum.toString();
        int len = s.length();
        for(int i=len-1;i>=0;i--){
            ListNode cur = new ListNode(s.charAt(i)-'0');
            temp.next = cur;
            temp = temp.next;
        }
        return ans.next;
    }
}