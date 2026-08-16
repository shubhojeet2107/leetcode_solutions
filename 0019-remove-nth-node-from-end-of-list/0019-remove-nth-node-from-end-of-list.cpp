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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if(head == NULL || head->next == NULL) return NULL;
        int count = (length(head) - n);
        if(count == 0) return head->next;

        ListNode* temp = head;

        while(count > 1){
            temp = temp->next;
            count--;
        }

        temp->next = temp->next->next;
        return head;
    }

    int length(ListNode* head){
        int count = 0;
        ListNode* temp = head;

        while(temp != NULL){
            count++;
            temp = temp->next;
        }

        return count;
    }
};