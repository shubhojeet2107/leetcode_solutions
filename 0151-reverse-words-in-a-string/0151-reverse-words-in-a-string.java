class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder str = new StringBuilder();

        int i = s.length()-1;
        int j = s.length()-1;

        while(i >= 0){
            while(i >= 0 && s.charAt(i) != ' '){
                i--;
            }

            str.append(s.substring(i+1, j+1));
            str.append(" ");

            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }

            j=i;
        }

        return str.toString().trim();
    }
}