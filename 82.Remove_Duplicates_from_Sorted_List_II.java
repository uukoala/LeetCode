/* 
 *Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = new ListNode(0), pre = cur;
        while(head != null){
            if(head.next != null && head.val == head.next.val){
                int value = head.val;
                while(head != null && head.val == value) head = head.next;
            }
            else{
                cur.next = head;
                cur = cur.next;
                head = head.next;
            }
        }
        cur.next = null; //important, to avoid include the wrong node.
        return pre.next;
    }
}
