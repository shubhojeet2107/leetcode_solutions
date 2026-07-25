class Solution {
    int MOD = 1337;
    public int superPow(int a, int[] b) {
        a %= MOD;
        int ans = 1;
        for(int i=0; i<b.length; i++){
            ans = pow(ans, 10);
            ans = (int)(((long) ans * pow(a, b[i])) % MOD);
        }

        return ans;
    }

    public int pow(int a, int num){
        if(num == 0) return 1;

        int half = pow(a, num/2);

        if(num % 2 == 0){
            return (int)(((long) half * half) % MOD);
        }else{
            return (int)((((long) a * half) % MOD * half) % MOD);
        }
    }
}