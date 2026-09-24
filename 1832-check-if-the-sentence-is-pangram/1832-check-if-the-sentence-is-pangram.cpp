class Solution {
public:
    bool checkIfPangram(string sentence) {
        int freq[26] = {0};
        int length = sentence.length();

        for(int i=0; i<length; i++){
            char ch = sentence[i];
            freq[ch - 'a']++;
        }

        for(int i=0; i<26; i++){
            if(freq[i] == 0) return false;
        }

        return true;
    }
};