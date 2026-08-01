class Solution {
    int[][] dp;
    public boolean predictTheWinner(int[] nums) {
        dp = new int[nums.length+1][nums.length+1];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }

        return recursive(nums, 0, nums.length-1) >= 0;
    }

    public int recursive(int[] nums, int i, int j){
        if(i == j){
            return nums[i];
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        return dp[i][j] = Math.max(
            nums[i] - recursive(nums, i+1, j),
            nums[j] - recursive(nums, i, j-1)
        );
    }
}