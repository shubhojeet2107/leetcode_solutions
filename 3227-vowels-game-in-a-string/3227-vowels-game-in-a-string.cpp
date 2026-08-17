class Solution {
public:
    bool doesAliceWin(string s) {
        int num = 0;
        for(int i=0; i<s.size(); i++){
            char ch = s[i];
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') num++;
        }

        if(num == 0) return false;
        return true;
    }
};