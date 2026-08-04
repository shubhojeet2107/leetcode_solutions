class Solution {
    vector<bool> dp;
public:
    bool winnerSquareGame(int n) {
        dp = vector<bool>(n+1, false);
        return recursive(n);
    }

    bool recursive(int num){
        if(num == 0) return false;

        if(dp[num]) return dp[num];

        for(int i=1; i*i <= num; i++){
            if(!recursive(num - i*i)) return dp[num] = true;
        }

        return dp[num] = false;
    }
};