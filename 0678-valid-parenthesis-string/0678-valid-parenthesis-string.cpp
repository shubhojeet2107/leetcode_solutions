class Solution {
public:
    bool checkValidString(string s) {
        stack<int> open;
        stack<int> star;

        for(int i=0; i<s.size(); i++){
            char ch = s[i];

            if(ch == '(') open.push(i);
            else if(ch == '*') star.push(i);
            else{ //(ch == ")")
                if(!open.empty()) open.pop();
                else if(!star.empty()) star.pop();
                else return false;
            }
        }

        while(!open.empty() && !star.empty()){
            if(star.top() > open.top()){
                open.pop();
                star.pop();
            }else return false;
        }

        return open.empty();
    }
};