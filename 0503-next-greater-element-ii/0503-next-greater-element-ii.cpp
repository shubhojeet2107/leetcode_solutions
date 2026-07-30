class Solution {
public:
    vector<int> nextGreaterElements(vector<int>& nums) {
        vector<int> arr(nums.size(), -1);
        stack<int> stack;

        for(int i=0; i<2*nums.size(); i++){
            int index = i%nums.size();
            while(!stack.empty() && nums[stack.top()] < nums[index]){
                int topIndex = stack.top();
                arr[topIndex] = nums[index];
                stack.pop();
            }

            if(i < nums.size()) stack.push(i);
        }

        return arr;
    }
};