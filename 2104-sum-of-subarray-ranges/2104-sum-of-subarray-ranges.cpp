class Solution {
public:
    long long subArrayRanges(vector<int>& nums) {
        long long range = 0;

        for(int i=0; i<nums.size(); i++){
            int mn = nums[i];
            int mx = nums[i];
            for(int j=i+1; j<nums.size(); j++){
                mx = max(mx, nums[j]);
                mn = min(mn, nums[j]);

                range += (mx-mn);
            }
        }

        return range;
    }
};