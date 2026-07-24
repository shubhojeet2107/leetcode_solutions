class Solution {
    int MOD = 1000000007;
    public int countGoodNumbers(long n) {
        long evenCount = ((n+1)/2);
        long oddCount = (n/2); 

        long evenWays = pow(5, evenCount);
        long oddWays = pow(4, oddCount);

        return (int)((evenWays * oddWays) % MOD);
    }

    public long pow(long x, long n){
        if(n == 0) return 1;
        long half = pow(x, n/2);

        if(n % 2 == 0) return (half * half) % MOD;
        else return (((half * half) % MOD) * x ) % MOD;
    }
}