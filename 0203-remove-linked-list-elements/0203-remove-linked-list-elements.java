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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode pointer = head;

        while(pointer != null){
            if(pointer.val == val){
                if(prev == null){
                    head = pointer.next;
                } 
                else {
                    prev.next = pointer.next;
                }
            } 
            else {
                prev = pointer;
            }
            pointer = pointer.next;
        }

        return head;
    }
}