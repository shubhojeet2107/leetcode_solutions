class Solution {
public:
    int smallestNumber(int n, int t) {
        if(n == t) return n;

        for(int i=n; i<=n+t; i++){
            int ans = prodOfDigits(i);
            if(ans % t == 0) return i;
        }

        return -1;
    }

    int prodOfDigits(int num){
        int ans = 1;
        while(num > 0){
            ans *= num%10;
            num /= 10;
        }
        
        return ans;
    }
};