class Solution {
    int ans = 0;
    public int triangularSum(int[] nums) {
        recursive(nums);
        return ans;
    }

    void recursive(int[] nums){
        if(nums.length == 1) {
            ans = nums[0];
            return;
        }

        int[] newArr = new int[nums.length - 1];
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] + nums[i] >= 10){
                newArr[i-1] = (nums[i-1] + nums[i]) % 10;
            }else{
                newArr[i-1] = (nums[i-1] + nums[i]);
            }
        }

        recursive(newArr);
    }
}