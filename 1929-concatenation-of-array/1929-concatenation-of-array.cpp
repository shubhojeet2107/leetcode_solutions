class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        vector<int> arr(2 * nums.size(), -1);
        int n = nums.size();

        for(int i=0; i<nums.size(); i++){
            arr[i] = nums[i];
            arr[i + n] = nums[i];
        }

        return arr;
    }
};