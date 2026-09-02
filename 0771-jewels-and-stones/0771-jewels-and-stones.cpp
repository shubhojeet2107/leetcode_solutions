class Solution {
public:
    int numJewelsInStones(string jewels, string stones) {
        unordered_map<char, int> map;
        int total = 0;

        for (char ch : stones) {
            map[ch]++;
        }

        for (char ch : jewels) {
            if (map.contains(ch)) {
                total += map[ch];
            }
        }

        return total;
    }
};