class Solution {
public:
    string convert(string s, int numRows) {
        if(numRows == 1) return s;

        vector<string> arr(numRows);
        bool down = true;
        int row = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s[i];

            arr[row] += ch;

            if(row == numRows-1) down = false;
            if(row == 0) down = true;

            if(down) row++;
            if(!down) row--;
        }

        string result = "";
        for(int i=0; i<arr.size(); i++){
            result += arr[i];
        }

        return result;
    }
};