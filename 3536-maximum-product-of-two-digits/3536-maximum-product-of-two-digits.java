class Solution {
    public int maxProduct(int n) {
        String str = Integer.toString(n);

        int first = 0;
        int second = 0;

        for(int i=0; i<str.length(); i++){
            int ch = str.charAt(i) - '0';

            if(ch >= first){
                second = first;
                first = ch;
            }else if(ch > second){
                second = ch;
            }
        }

        return first*second;
    }
}