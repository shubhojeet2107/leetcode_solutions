class Solution {
public:
    int minimumPushes(string word) {
        vector<int> freq(26, 0);
        for(int i=0; i<word.size(); i++){
            freq[word[i] - 'a']++; 
        }

        sort(freq.begin(), freq.end());

        int count = 0;
        int press = 1;
        int ans = 0;
        for(int i=freq.size()-1; i>=0; i--){
            if(freq[i] == 0) break;

            if(count == 8){
                count = 0;
                press++;
            }

            ans += press*freq[i];
            count++;
        }

        return ans;
    }
};