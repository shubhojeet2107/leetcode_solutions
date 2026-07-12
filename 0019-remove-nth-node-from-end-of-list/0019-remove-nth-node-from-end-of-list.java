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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = length(head);
        int point = (len - n);

        if (point == 0) {
            return head.next;
        }

        ListNode temp = head;

        while (point > 1) {
            temp = temp.next;
            point--;
        }

        temp.next = temp.next.next;
        return head;
    }

    public int length(ListNode head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }
}