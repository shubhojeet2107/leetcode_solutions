class Solution {
    vector<vector<int>> dp;
public:
    bool predictTheWinner(vector<int>& nums) {
        dp = vector<vector<int>>(nums.size(), vector<int>(nums.size(), -1));

        return recursive(nums, 0, nums.size()-1) >= 0;
    }

    int recursive(vector<int>& nums, int i, int j){
        if(i == j) return nums[i];

        if(dp[i][j] != -1) return dp[i][j];

        return dp[i][j] = max(
            nums[i] - recursive(nums, i+1, j),
            nums[j] - recursive(nums, i, j-1)
        );
    }
};