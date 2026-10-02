class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    void backtrack(List<String> result, String p, int open, int close, int n){
        if(p.length() == 2*n){
            result.add(p);
            return;
        }

        if(open < n){
            backtrack(result, p+"(", open+1, close, n);
        }
        if(close < open){
            backtrack(result, p+")", open, close+1, n);
        }
    }
}