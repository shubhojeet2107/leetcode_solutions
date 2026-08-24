class Solution {
    Integer[] dp;
    public int stoneGameVIII(int[] stones) {
        for(int i=1; i<stones.length; i++){
            stones[i] += stones[i-1];
        }

        dp = new Integer[stones.length+1];

        return recursive(stones, 1);
    }

    int recursive(int[] stones, int index){
        if(index == stones.length - 1) return stones[index];

        if(dp[index] != null) return dp[index];

        int next = recursive(stones, index + 1);
        int take = stones[index] - next;
        int skip = next;

        return dp[index] = Math.max(take, skip);
    }
}