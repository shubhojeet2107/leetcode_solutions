class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        String str = "";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == ')' && stack.isEmpty()) continue;
            else if(ch == ')' && !stack.isEmpty() && stack.peek() == '(') stack.pop();
            else if(ch == '(') stack.push(ch);

            str += ch;
        }

        String result = "";
        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);

            if(ch == '(' && !stack.isEmpty()){
                stack.pop();
                continue;
            }

            result += ch;
        }

        return new StringBuilder(result).reverse().toString();
    }
}