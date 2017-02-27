/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode preHead = new ListNode(0), nNode = head, cur = preHead;
        cur.next = head;
        while(n-- != 0){
            nNode = nNode.next;
        }
        while(nNode != null){
            cur = cur.next;
            nNode = nNode.next;
        }
        cur.next = cur.next.next;
        return preHead.next;
        
    }
}
