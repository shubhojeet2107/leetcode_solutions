class Solution {
public:
    int findGCD(vector<int>& nums) {
        int mx = nums[0];
        int mn = nums[0];

        for(int i=0; i<nums.size(); i++){
            mx = max(mx, nums[i]);
            mn = min(mn, nums[i]);
        }

        return GCD(mx, mn);
    }

    int GCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = (a % b);
            a = temp;
        }

        return a;
    }
};