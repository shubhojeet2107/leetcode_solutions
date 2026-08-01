class Solution {
    vector<int> dp;
    vector<bool> visited;
public:
    string stoneGameIII(vector<int>& stoneValue) {
        dp = vector<int>(stoneValue.size(), -1);
        visited = vector<bool>(stoneValue.size(), false);

        int diff = recursive(stoneValue, 0);

        if(diff > 0) return "Alice";
        else if(diff < 0) return "Bob";
        else return "Tie";
    }

    int recursive(vector<int>& nums, int index){
        if(index >= nums.size()) return 0;

        if(visited[index]) return dp[index];
        
        visited[index] = true;

        int ans = INT_MIN;
        int take = 0;

        for(int i=1; i<=3 && (index + i - 1) < nums.size(); i++){
            take += nums[index + i - 1];

            ans = max(ans, take - recursive(nums, index+i));
        }

        return dp[index] = ans;
    }
};