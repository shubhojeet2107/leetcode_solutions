class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(') stack.push(0);
            else{
                int curr = stack.pop();
                int score;

                if(curr == 0) score = 1;
                else score = (2 * curr);

                stack.push(stack.pop() + score);
            }
        }

        return stack.pop();
    }
}