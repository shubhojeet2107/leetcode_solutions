class Solution {
    public boolean predictTheWinner(int[] nums) {
        return recursive(nums, 0, nums.length-1) >= 0;
    }

    public int recursive(int[] nums, int i, int j){
        if(i == j){
            return nums[i];
        }

        return Math.max(
            nums[i] - recursive(nums, i+1, j),
            nums[j] - recursive(nums, i, j-1)
        );
    }
}