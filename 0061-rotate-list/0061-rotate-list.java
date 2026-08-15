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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;

        int length = length(head);
        k = (k % length);

        if(k == 0) return head;

        int count = (length - k - 1);
        ListNode split = head;
        while(count > 0){
            split = split.next;
            count--;
        }

        ListNode temp = split;
        temp = temp.next;
        ListNode newHead = temp;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = head;
        split.next = null;
        return newHead;
    }

    int length(ListNode head){
        int count = 0;
        ListNode temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        return count;
    }
}