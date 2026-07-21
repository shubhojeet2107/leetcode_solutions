class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int best = 0;

        for(int i=0; i<nums.length; i++){
            best = Math.max(best+nums[i], nums[i]);
            ans = Math.max(best, ans);
        }

        return ans;
    }
}