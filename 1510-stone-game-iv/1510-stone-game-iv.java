class Solution {
    boolean[] dp;
    public boolean winnerSquareGame(int n) {
        dp = new boolean[n+1];
        return recursive(n);
    }

    public boolean recursive(int num){
        if(num == 0) return false;

        if(dp[num]) return dp[num];

        for(int i=1; i*i<=num; i++){
            if(!recursive(num - i*i)) return dp[num] = true;
        }
        return dp[num] = false;
    }
}