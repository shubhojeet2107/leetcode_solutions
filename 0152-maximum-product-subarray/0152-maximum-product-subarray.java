class Solution {
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int maxEnd = 1;
        int minEnd = 1;

        for(int i=0; i<nums.length; i++){
            int v1 = 1;
            int v2 = 1;
            int v3 = 1;

            if(i == 0){
                v2 = nums[i];
                v3 = nums[i];
            }else{
                v2 = maxEnd*nums[i];
                v3 = minEnd*nums[i];
            }

            v1 = nums[i];

            maxEnd = Math.max(v1, Math.max(v2, v3));
            minEnd = Math.min(v1, Math.min(v2, v3));

            ans = Math.max(ans, Math.max(maxEnd, minEnd));
        }

        return ans;
    }
}