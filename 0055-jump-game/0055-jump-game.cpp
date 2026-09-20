class Solution {
public:
    bool canJump(vector<int>& nums) {
        int maxLen = 0;
        for(int i=0; i<nums.size(); i++){
            if(i <= maxLen){
                maxLen = max(maxLen, (nums[i] + i));
                if(maxLen >= nums.size() - 1) return true;
            }
        }

        return false;
    }
};