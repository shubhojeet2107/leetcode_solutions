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
    ListNode* swapNodes(ListNode* head, int k) {
        int length = len(head);
        int front = (k-1);
        int last = (length-k);

        ListNode *p1 = head;
        while(front > 0){
            p1 = p1->next;
            front--;
        }

        ListNode *p2 = head;
        while(last > 0){
            p2 = p2->next;
            last--;
        }

        int temp = p1->val;
        p1->val = p2->val;
        p2->val = temp;

        return head;
    }

    int len(ListNode *head){
        ListNode* temp = head; 
        int count = 0;

        while(temp != NULL){
            count++;
            temp = temp->next;
        }

        return count;
    }
};