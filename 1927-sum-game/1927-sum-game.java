class Solution {
    public boolean sumGame(String num) {
        int leftSum = 0;
        int leftCount = 0;
        for(int i=0; i<num.length()/2; i++){
            char ch = num.charAt(i);

            if(ch == '?') leftCount++;
            else leftSum += (ch - '0');
        }

        int rightSum = 0;
        int rightCount = 0;
        for(int i=num.length()/2; i<num.length(); i++){
            char ch = num.charAt(i);

            if(ch == '?') rightCount++;
            else rightSum += (ch - '0');
        }

        int diff = (leftSum - rightSum);
        return 2 * diff != 9 * (rightCount - leftCount);
    }
}