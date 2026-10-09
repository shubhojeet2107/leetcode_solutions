class Solution {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '(') {
                // We need two consecutive ')' for every '('
                stack.push(ch);
            }
            else {
                // Check if another ')' follows
                if(i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                }
                else {
                    count++;
                }

                if(!stack.isEmpty()) {
                    stack.pop();
                }
                else {
                    // Insert a missing '('
                    count++;
                }
            }
        }

        count += stack.size() * 2;
        return count;
    }
}