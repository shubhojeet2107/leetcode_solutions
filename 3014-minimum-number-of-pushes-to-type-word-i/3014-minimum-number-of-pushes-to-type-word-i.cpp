class Solution {
public:
    int minimumPushes(string word) {
        int n = word.size();
        int ans = 0;
        int press = 1;

        while(n > 0){
            int take = std::min(8, n);
            ans += take*press;
            n -= take;
            press++;
        }

        return ans;
    }
};