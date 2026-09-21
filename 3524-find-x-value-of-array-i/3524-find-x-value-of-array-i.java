class Solution {

    long[][] dp;
    int k;

    public long[] resultArray(int[] nums, int k) {

        this.k = k;

        long[] result = new long[k];

        dp = new long[nums.length][k];

        for(int i = 0; i < nums.length; i++){
            Arrays.fill(dp[i], -1);
        }

        for(int i = 0; i < nums.length; i++){

            for(int remainder = 0; remainder < k; remainder++){
                result[remainder] += solve(nums, i, remainder);
            }
        }

        return result;
    }

    long solve(int[] nums, int index, int remainder) {

        if(index < 0)
            return 0;

        if(dp[index][remainder] != -1)
            return dp[index][remainder];

        long count = 0;

        // Subarray containing only nums[index]
        if(nums[index] % k == remainder)
            count++;

        // Extend previous subarrays
        for(int r = 0; r < k; r++){

            int newRemainder = (r * (nums[index] % k)) % k;

            if(newRemainder == remainder){
                count += solve(nums, index - 1, r);
            }
        }

        return dp[index][remainder] = count;
    }
}