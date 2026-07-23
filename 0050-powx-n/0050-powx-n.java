class Solution {
    public double myPow(double x, int n) {
        if(n < 0){
            return 1 / (recursive(x, -n));
        }

        return recursive(x, n);
    }

    public double recursive(double x, int n){
        if(n == 0) return 1;

        double half = recursive(x, n/2);

        if(n % 2 == 0) {
            return half * half;
        }
        else{
            return half * half * x;
        }
    }
}