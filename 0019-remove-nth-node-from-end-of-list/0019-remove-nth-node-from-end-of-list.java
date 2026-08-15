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
        if(head == null || head.next == null) return null;
        int count = (length(head) - n);
        if(count == 0) return head.next;
        
        ListNode temp = head;

        while(count > 1){
            temp = temp.next;
            count--;
        }

        if(n == 1) temp.next = null;
        else temp.next = temp.next.next;

        return head;
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