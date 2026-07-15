class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        StringBuilder ans = new StringBuilder();
        ans.append(s);
        ans.append(s);

        if(ans.toString().contains(goal)){
            return true;
        } else{
            return false;
        }
    }
}