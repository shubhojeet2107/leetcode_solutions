class Solution {
public:
    int maxArea(vector<int>& height) {
        int ans = 0;
        int start = 0;
        int end = height.size()-1;

        while(end > start){
            ans = max(ans, ((min(height[start], height[end]) * (end - start))));

            if(height[end] > height[start]) start++;
            else end--;
        }

        return ans;
    }
};