class Solution {
public:
    string convertToTitle(int num) {
        string ans = "";

        while(num > 0){
            num--;

            char ch = (char)('A' + (num%26));
            ans += ch;

            num /= 26;
        }

        reverse(ans.begin(), ans.end());
        return ans;
    }
};