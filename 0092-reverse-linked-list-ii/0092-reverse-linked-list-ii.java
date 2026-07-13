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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;
        for(int i=1; i<left; i++){
            temp = temp.next;
        }

        ListNode start = temp.next;
        ListNode reverse = reverse(start, left, right);
        temp.next = reverse;

        return dummy.next;
    }

    public ListNode reverse(ListNode head, int left, int right){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;

        while(right >= left){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null){
                next = next.next;
            }
            left++;
        }

        head.next = curr;
        return prev;
    } 
}