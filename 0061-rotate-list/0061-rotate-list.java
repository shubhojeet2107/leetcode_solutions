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
        if(head == null || head.next == null || k < 1) return head;
        int len = length(head);
        int rotate = (k % len);
        if(rotate == 0) return head;
        
        int split = (len - rotate);

        ListNode tail = head;
        ListNode splitHead = head;

        while(tail.next != null){
            tail = tail.next;
        }

        while(split > 1){
            splitHead = splitHead.next;
            split--;
        }

        ListNode newHead = splitHead.next;
        splitHead.next = null;
        tail.next = head;

        return newHead;
    }

    public int length(ListNode head){
        int count = 0;
        while(head != null){
            head = head.next;
            count++;
        }
        return count;
    }
}