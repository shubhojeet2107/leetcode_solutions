class Solution {
    int[][] dp;
    public boolean stoneGame(int[] piles) {
        dp = new int[piles.length+1][piles.length+1];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i], -1);
        }
        return recursive(piles, 0, piles.length-1) >= 0;
    }

    public int recursive(int[] nums, int i, int j){
        if(i == j) return nums[i];

        if(dp[i][j] != -1) return dp[i][j];

        return dp[i][j] = Math.max(
            nums[i] - recursive(nums, i+1, j),
            nums[j] - recursive(nums, i, j-1)
        );
    }
}