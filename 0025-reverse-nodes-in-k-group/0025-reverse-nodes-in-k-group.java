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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k < 2) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prevHead = dummy;
        ListNode curr = head;

        while(curr != null){
            ListNode temp = curr;
            int count = 0;

            while(temp != null && count < k){
                temp = temp.next;
                count++;
            }

            if(count < k) {
                break;
            }

            ListNode newEnd = reverse(curr, k);
            prevHead.next = newEnd;

            prevHead = curr;
            curr = curr.next;
        }

        return dummy.next;
    }

    public ListNode reverse(ListNode head, int k) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;

        while (k > 0) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null) {
                next = next.next;
            }

            k--;
        }

        head.next = curr;
        return prev;
    }
}