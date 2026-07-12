/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = length(headA);
        int len2 = length(headB);
        int diff = Math.abs(len1-len2);

        ListNode p1 = headA;
        ListNode p2 = headB;

        if(len1 > len2){
            while(diff > 0){
                p1 = p1.next;
                diff--;
            }
        }else{
            while(diff > 0){
                p2 = p2.next;
                diff--;
            }
        }

        while(p1 != null && p2 != null){
            if(p1 == p2){
                return p1;
            }

            p1 = p1.next;
            p2 = p2.next;
        }

        return null;
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