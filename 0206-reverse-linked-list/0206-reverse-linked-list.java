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
    ListNode head, tail;
    public ListNode reverseList(ListNode node) {
        if(node == null){
            return node;
        }

        if(node.next == null){
            head = node;
            tail = node;
            return tail;
        }

        reverseList(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;

        return head;
    }
}