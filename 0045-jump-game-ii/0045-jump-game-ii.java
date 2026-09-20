class Solution {
    int[] dp;
    public int jump(int[] nums) {
        dp = new int[nums.length + 1];
        for(int i=0; i<dp.length; i++){
            dp[i] = -1;
        }

        return recursive(nums, 0);
    }

    int recursive(int[] arr, int index){
        if(index == arr.length-1){
            return 0;
        }

        if(dp[index] != -1) return dp[index];

        int min = Integer.MAX_VALUE;

        for(int i=1; i<=arr[index] && index + i < arr.length; i++){
            int current = recursive(arr, index + i);

            if(current != Integer.MAX_VALUE) {
                min = Math.min(min, current + 1);
            }
        }

        return dp[index] = min;
    }
}