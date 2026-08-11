class Solution {
public:
    int missingInteger(vector<int>& nums) {
        unordered_set<int> set;
        for(int i=0; i<nums.size(); i++){
            set.insert(nums[i]);
        }

        int ans = nums[0];
        for(int i=1; i<nums.size(); i++){
            if(nums[i] != nums[i-1] + 1) break;
            ans += nums[i];
        }

        while(set.count(ans)){
            ans++;
        }

        return ans;
    }
};