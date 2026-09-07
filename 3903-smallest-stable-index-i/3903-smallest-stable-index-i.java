class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int index = -1;

        for(int i=0; i<nums.length; i++){
            max = Math.max(max, nums[i]);

            int min = Integer.MAX_VALUE;
            for(int j=i; j<nums.length; j++){
                min = Math.min(min, nums[j]);
            }

            int score = (max-min);
            if(score <= k){
                index = i;
                break;
            }
        }

        return index;
    }
}