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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = prev.next;
        ListNode next = curr.next;

        int first = -1;
        int last = -1;
        int count = 1;

        int minDist = Integer.MAX_VALUE;

        while (next != null) {
            if ((curr.val > prev.val && curr.val > next.val) || (curr.val < prev.val && curr.val < next.val)) {
                if (first == -1) first = count;
                if (last != -1) minDist = Math.min(minDist, count - last);

                last = count;
            }

            prev = curr;
            curr = next;
            next = next.next;
            count++;
        }

        if(first == -1 || first == last) return new int[]{-1, -1};

        int maxDist = (last - first);

        return new int[] {minDist, maxDist};
    }
}