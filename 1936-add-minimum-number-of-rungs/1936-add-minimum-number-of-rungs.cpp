class Solution {
public:
    int addRungs(vector<int>& nums, int dist) {
        int count = 0;
        int prev = 0;

        for(int i=0; i<nums.size(); i++){
            if(nums[i] - prev > dist){
                int gap = (nums[i] - prev);
                if(gap > dist) count += (gap-1)/dist;
            }
            prev = nums[i];
        }

        return count;
    }
};