class Solution {
public:
    int trap(vector<int>& height) {
        stack<int> stack;
        int ans = 0;

        for(int i=0; i<height.size(); i++){

            while(!stack.empty() && height[i] > height[stack.top()]){
                int middle = stack.top();
                stack.pop();

                if(stack.empty()) break;

                int left = stack.top();
                int width = i - left - 1;

                int h = min(height[i], height[left]) - height[middle];
                ans += width*h;
            }
            stack.push(i);
        }

        return ans;
    }
};