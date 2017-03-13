/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode pre = new ListNode(0), after = new ListNode(0);
        ListNode cur1 = pre, cur2 = after;
        while(head != null){
            if(head.val < x){
                cur1.next = head;
                cur1 = cur1.next;
            }
            else{
                cur2.next = head
                cur2 = cur2.next;
            }
            head = head.next;
        }
        cur2.next = null; //very important, avoid cycle in linked list.
        cur1.next = after.next;
        return pre.next;
    }
}
