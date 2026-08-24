class Solution {
    public int longestValidParentheses(String s) {
        int maxL = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(') stack.push(i);
            else{
                stack.pop();

                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    int length = i - stack.peek();
                    maxL = Math.max(length, maxL);
                }
            }
        }

        return maxL;
    }
}