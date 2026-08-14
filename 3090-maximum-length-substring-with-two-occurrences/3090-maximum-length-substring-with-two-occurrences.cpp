class Solution {
public:
    int maximumLengthSubstring(string s) {
        int freq[26] = {0};
        int left = 0;
        int length = 0;

        for(int right = 0; right<s.length(); right++){
            char ch = s[right];

            freq[ch - 'a']++;

            while(freq[ch - 'a'] > 2){
                char leftChar = s[left];
                freq[leftChar - 'a']--;
                left++;
            }
            length = max(length, (right-left+1));
        }
        return length;
    }
};