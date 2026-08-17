class Solution {
public:
    int getLastMoment(int n, vector<int>& left, vector<int>& right) {
        int leftMax = 0;
        for(int i=0; i<left.size(); i++){
            leftMax = max(leftMax, left[i]);
        }

        int rightMin = n;
        for(int i=0; i<right.size(); i++){
            rightMin = min(rightMin, right[i]);
        }

        return max(leftMax, n-rightMin);
    }
};