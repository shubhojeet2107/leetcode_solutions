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
    ListNode* rotateRight(ListNode* head, int k) {
        if(head == NULL || head->next == NULL) return head;
        int length = len(head);

        k = (k % length);
        if(k == 0) return head;

        int moveRight = (length-k-1);
        ListNode *split = head;
        while(moveRight > 0){
            split = split->next;
            moveRight--;
        }

        ListNode *newHead = split->next;
        ListNode *temp = newHead;

        while(temp->next != NULL){
            temp = temp->next;
        }

        temp->next = head;
        split->next = NULL;

        return newHead;
    }

    int len(ListNode* head){
        int count = 0;
        ListNode* temp = head;

        while(temp != NULL){
            count++;
            temp = temp->next;
        }
        return count;
    }
};