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
    ListNode* removeElements(ListNode* head, int val) {
        ListNode* prev = NULL;
        ListNode* pointer = head;

        while(pointer != NULL){
            if(pointer->val == val){
                if(prev == NULL) head = pointer->next;
                else prev->next = pointer->next;
            }
            else prev = pointer;
            pointer = pointer->next;
        }

        return head;
    }
};