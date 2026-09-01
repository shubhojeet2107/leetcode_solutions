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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }

        int[] arr = new int[count];
        ListNode curr = head;
        for(int i=0; i<count; i++){
            arr[i] = curr.val;
            curr = curr.next;
        }

        return NGE(arr);
    }

    int[] NGE(int[] nums){
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums.length];

        Arrays.fill(result, 0);

        for(int i=0; i<result.length; i++){
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i]){
                result[stack.peek()] = nums[i];
                stack.pop();
            }

            stack.push(i);
        }

        return result;
    }
}