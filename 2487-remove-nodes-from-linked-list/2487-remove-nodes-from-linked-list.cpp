/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNodes(ListNode* head) {
        stack<ListNode*> stack;
        ListNode* curr = head;

        while(curr != NULL){
            while(!stack.empty() && stack.top()->val < curr->val){
                stack.pop();
            }

            stack.push(curr);
            curr = curr->next;
        }

        ListNode* newHead = NULL;
        while(!stack.empty()){
            ListNode* node = stack.top();
            stack.pop();
            node->next = newHead;
            newHead = node;
        }

        return newHead;
    }
};