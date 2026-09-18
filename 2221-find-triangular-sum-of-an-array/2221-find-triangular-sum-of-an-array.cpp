class Solution {
    int ans = 0;
public:
    int triangularSum(vector<int>& nums) {
        recursive(nums);
        return ans;
    }

    void recursive(vector<int>& nums){
        if(nums.size() == 1){
            ans = nums[0];
            return;
        }

        vector<int> newArr(nums.size() - 1);
        for(int i=1; i<nums.size(); i++){
            newArr[i-1] = (nums[i-1] + nums[i]) % 10;
        }

        recursive(newArr);
    }
};