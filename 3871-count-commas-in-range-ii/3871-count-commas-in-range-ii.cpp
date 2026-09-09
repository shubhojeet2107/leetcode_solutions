class Solution {
public:
    long long countCommas(long long n) {
        long long comma = 0;
        long long place = 1000;

        while(n >= place){
            comma += (n - place + 1);
            place *= 1000;
        }

        return comma;
    }
};