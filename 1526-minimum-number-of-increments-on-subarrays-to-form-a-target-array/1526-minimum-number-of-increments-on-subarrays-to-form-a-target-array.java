class Solution {
    public int minNumberOperations(int[] nums) {
        int operations = nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i] > nums[i-1]){
                operations += nums[i] - nums[i-1];
            }
        }

        return operations;
    }
}