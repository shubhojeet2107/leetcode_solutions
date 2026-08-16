class Solution {
    public String convertToTitle(int num) {
        StringBuilder str = new StringBuilder();

        while(num > 0){
            num--;
            char ch = (char)('A' + num%26); 

            str.append(ch);
            num /= 26;
        }

        return str.reverse().toString();
    }
}