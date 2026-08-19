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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;

        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);

        ListNode curr = head;

        ListNode p1 = dummy1;
        ListNode p2 = dummy2;

        while(curr != null){
            if(curr.val < x){
                p1.next = curr;
                p1 = curr;
            }else{
                p2.next = curr;
                p2 = curr;
            }
            curr = curr.next;
        }

        p1.next = dummy2.next;
        p2.next = null;

        return dummy1.next;
    }
}