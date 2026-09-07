class Solution {
public:
    int firstStableIndex(vector<int>& nums, int k) {
        int mx = INT_MIN;
        int index = -1;

        for(int i=0; i<nums.size(); i++){
            mx = max(mx, nums[i]);

            int mn = INT_MAX;
            for(int j=i; j<nums.size(); j++){
                mn = min(mn, nums[j]);
            }

            int score = (mx-mn);
            if(score <= k){
                index = i;
                break;
            }
        }

        return index;
    }
};