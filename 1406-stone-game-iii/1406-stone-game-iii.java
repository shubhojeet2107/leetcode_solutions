class Solution {
    int[] dp;
    public String stoneGameIII(int[] stoneValue) {
        dp = new int[stoneValue.length];
        Arrays.fill(dp, -1);

        int diff = recursive(stoneValue, 0);

        if(diff > 0) return "Alice";
        else if(diff < 0) return "Bob";
        else return "Tie";
    }

    public int recursive(int[] nums, int index){
        if(index >= nums.length){
            return 0;
        }

        if(dp[index] != -1) return dp[index];

        int ans = Integer.MIN_VALUE;
        int take = 0;

        for(int i = 1; i <= 3 && (index + i - 1) < nums.length; i++){
            take += nums[index + i - 1];

            ans = Math.max(ans, take - recursive(nums, index+i));
        }

        return dp[index] = ans;
    }
}