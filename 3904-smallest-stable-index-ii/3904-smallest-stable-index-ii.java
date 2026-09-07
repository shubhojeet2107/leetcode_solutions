class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] suffix = new int[nums.length];
        suffix[nums.length-1] = nums[nums.length-1];

        for(int i=nums.length-2; i>=0; i--){
            suffix[i] = Math.min(nums[i], suffix[i+1]);
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            max = Math.max(max, nums[i]);

            int score = (max - suffix[i]);
            if(score <= k){
                return i;
            } 
        }

        return -1;
    }
}