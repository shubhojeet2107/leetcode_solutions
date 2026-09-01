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

    vector<int> nextLargerNodes(ListNode* head) {

        ListNode* temp = head;
        int count = 0;

        while (temp != nullptr) {
            count++;
            temp = temp->next;
        }

        vector<int> arr(count);

        ListNode* curr = head;

        for (int i = 0; i < count; i++) {
            arr[i] = curr->val;
            curr = curr->next;
        }

        return NGE(arr);
    }

    vector<int> NGE(vector<int>& nums) {

        stack<int> st;

        vector<int> result(nums.size(), 0);

        for (int i = 0; i < result.size(); i++) {

            while (!st.empty() && nums[st.top()] < nums[i]) {

                result[st.top()] = nums[i];

                st.pop();
            }

            st.push(i);
        }

        return result;
    }
};