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
    ListNode* partition(ListNode* head, int x) {
        ListNode* dummy1 = new ListNode(-1);
        ListNode* dummy2 = new ListNode(-1);

        ListNode* curr = head;

        ListNode* p1 = dummy1;
        ListNode* p2 = dummy2;

        while(curr != NULL){
            if(curr->val < x){
                p1->next = curr;
                p1 = curr;
            }else{
                p2->next = curr;
                p2 = curr;
            }
            curr = curr->next;
        }

        p1->next = dummy2->next;
        p2->next = NULL;

        return dummy1->next;
    }
};