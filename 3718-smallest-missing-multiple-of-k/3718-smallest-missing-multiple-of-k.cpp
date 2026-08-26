class Solution {
public:
    int missingMultiple(vector<int>& nums, int k) {
        unordered_set<int> map;
        for(int i=0; i<nums.size(); i++){
            map.insert(nums[i]);
        }

        int mx = 0;
        for(int i=0; i<nums.size(); i++){
            mx = max(nums[i], mx);
        }

        for(int i=k; i<=mx; i+=k){
            if(map.find(i) == map.end(i)) return i;
        }

        return ((mx/k) + 1) * k;
    }
};