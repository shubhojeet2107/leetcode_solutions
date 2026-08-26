class Solution {
public:
    int countNegatives(vector<vector<int>>& grid) {
        int row = grid.size();
        int col = grid[0].size();
        int count = 0;

        for (int i = 0; i < row; i++) {
            int index = recursive(grid[i]);
            count += col - index;
        }

        return count;
    }

    int recursive(vector<int> nums) {
        int start = 0;
        int end = nums.size() - 1;
        int ans = nums.size();

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < 0) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
};