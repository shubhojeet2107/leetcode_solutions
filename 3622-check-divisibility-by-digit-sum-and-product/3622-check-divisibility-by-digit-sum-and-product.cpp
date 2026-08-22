class Solution {
public:
    bool checkDivisibility(int n) {
        int sum = 0;
        int temp1 = n;
        while(temp1 > 0){
            sum += (temp1%10);
            temp1 /= 10;
        }

        int product = 1;
        int temp2 = n;
        while(temp2 > 0){
            product *= (temp2%10);
            temp2 /= 10;
        }

        int total = (sum + product);
        return (n % total == 0);
    }
};