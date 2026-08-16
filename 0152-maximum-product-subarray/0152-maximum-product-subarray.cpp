class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int ans = INT_MIN;
        int maxEnd = 1;
        int minEnd = 1;

        for(int i=0; i<nums.size(); i++){
            int v1 = 1;
            int v2 = 1;
            int v3 = 1;

            if(i == 0){
                v2 = nums[i];
                v3 = nums[i];
            }else{
                v2 = maxEnd*nums[i];
                v3 = minEnd*nums[i];
            }

            v1 = nums[i];

            maxEnd = max(v1, max(v2, v3));
            minEnd = min(v1, min(v2, v3));

            ans = max(ans, max(maxEnd, minEnd));
        }

        return ans;
    }
};