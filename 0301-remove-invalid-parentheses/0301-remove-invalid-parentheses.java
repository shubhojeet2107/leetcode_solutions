class Solution {
    int minRemove;
    Set<String> result = new HashSet<>();
    public List<String> removeInvalidParentheses(String s) {
        int open = 0;
        int close = 0;

        // Find the minimum number of removals needed
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') open++;
            else if(s.charAt(i) == ')'){
                if(open > 0) open--;
                else close++;
            }
        }

        minRemove = open + close;

        backtrack(0, 0, 0, "", s);

        return new ArrayList<>(result);
    }

    void backtrack(int index, int balance, int removed, String current, String s) {
        if(index == s.length()){
            if(balance == 0 && removed == minRemove){
                result.add(current);
            }
            return;
        }

        char ch = s.charAt(index);
        // Normal character
        if(ch != '(' && ch != ')'){
            backtrack(index + 1, balance, removed, current + ch, s);
            return;
        }

        // OPTION 1: Remove this parenthesis
        backtrack(index + 1, balance, removed + 1, current, s);

        // OPTION 2: Keep this parenthesis
        if(ch == '('){
            backtrack(index + 1, balance + 1, removed, current + ch, s);
        }
        else{
            if(balance > 0){
                backtrack(index + 1, balance - 1, removed, current + ch, s);
            }
        }
    }
}