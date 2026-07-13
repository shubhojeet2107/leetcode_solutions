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
    public ListNode sortList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummyhead = new ListNode(-1);
        ListNode current = dummyhead;

        while(left != null && right != null){
            if(left.val < right.val){
                current.next = left;
                left = left.next;
            }else{
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        if(left != null){
            current.next = left;
        }else{
            current.next = right;
        }
        
        return dummyhead.next;
    }

    private ListNode getMid(ListNode head){
        ListNode midprev = null;
        while(head != null && head.next != null){
            if(midprev == null){
                midprev = head;
            }else{
                midprev = midprev.next;
            }
            head = head.next.next;
        }
        ListNode mid = midprev.next;
        midprev.next = null;
        return mid;
    }
}