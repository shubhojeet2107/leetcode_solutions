class Solution {
    public double myPow(double x, int n) {
        long power = n;

        if (power < 0) {
            return 1 / power(x, -power);
        }

        return power(x, power);
    }

    public double power(double x, long n) {
        if (n == 0) return 1;
        double half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}