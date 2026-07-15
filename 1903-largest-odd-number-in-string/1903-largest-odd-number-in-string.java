class Solution {
    public String largestOddNumber(String num) {
        StringBuilder ans = new StringBuilder();
        for(int i=num.length()-1; i>=0; i--){
            char ch = num.charAt(i);
            int digit = ch - '0';

            if(digit % 2 != 0){
                ans.append(num.substring(0, i+1));
                break;
            }else{
                continue;
            }
        }

        return ans.toString();
    }
}