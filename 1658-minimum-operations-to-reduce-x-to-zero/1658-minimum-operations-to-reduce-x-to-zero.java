class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            sum += nums[i];
        }

        int required = (sum - k);
        if(required < 0) return -1;

        int currentSum = 0;
        int length = -1;
        int left = 0;

        for(int right=0; right<n; right++){
            currentSum += nums[right];

            while(required < currentSum){
                currentSum -= nums[left];
                left++;
            }

            if(currentSum == required){
                length = Math.max(length, right - left + 1);
            }
        }

        if(length == -1) return -1;

        return (n - length);
    }
}