class Solution {
public:
    int countCommas(int n) {
        int count = 0;
        int place = 1000;

        while(n >= place){
            count += (n - place + 1);
            place *= place;
        }

        return count;
    }
};