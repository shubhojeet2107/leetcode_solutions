class Solution {
    public boolean isValid(String s) {
        int i = 0;
        Stack<Character> stack = new Stack<>();

        while (i < s.length()) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (ch == ')') {
                    if(stack.isEmpty() || stack.pop() != '(') return false;
                }
                if (ch == '}') {
                    if(stack.isEmpty() || stack.pop() != '{') return false;
                }
                if (ch == ']') {
                    if(stack.isEmpty() || stack.pop() != '[') return false;
                }
            }

            i++;
        }

        return stack.isEmpty();
    }
}