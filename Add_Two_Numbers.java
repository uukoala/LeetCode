/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int flag = 0;
        ListNode prehead = new ListNode(0);
        ListNode p = prehead;

        while(l1!=null || l2!=null || flag!=0){
            int sum = (l1 != null?l1.val:0) + (l2 != null?l2.val:0) + flag;
            
            p.next = new ListNode(sum%10);
            flag = sum/10;
            p = p.next;
            
            l1 = (l1 != null?l1.next:l1);
            l2 = (l2 != null?l2.next:l2);
        }
        return prehead.next;
    }
}
