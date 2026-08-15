class Solution {
public:
    int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int startOdd = 1;
        for(int i=0 ;i<n; i++){
            sumOdd += startOdd;
            startOdd += 2;
        }

        int sumEven = 0;
        int startEven = 2;
        for(int i=0; i<n; i++){
            sumEven += startEven;
            startEven += 2;
        }

        return GCD(sumOdd, sumEven);
    }

    int GCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = (a % b);
            a = temp;
        }

        return a;
    }
};