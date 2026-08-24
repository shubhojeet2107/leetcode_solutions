class Solution {
public:
    int longestValidParentheses(string s) {
        int maxL = 0;
        stack<int> stack;
        stack.push(-1);

        for(int i=0; i<s.length(); i++){
            char ch = s[i];

            if(ch == '(') stack.push(i);
            else{
                stack.pop();

                if(stack.empty()) stack.push(i);
                else{
                    int length = i - stack.top();
                    maxL = max(maxL, length);
                }
            }
        }
        return maxL;
    }
};