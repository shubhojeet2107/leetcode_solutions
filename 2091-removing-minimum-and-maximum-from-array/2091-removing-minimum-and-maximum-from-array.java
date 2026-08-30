class Solution {
    public int minimumDeletions(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIndex = 0;
        int minIndex = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
            if(nums[i] < min){
                min = nums[i];
                minIndex = i;
            }
        }

        int n = nums.length;

        int option1 = Math.max(minIndex, maxIndex) + 1;
        int option2 = Math.max(n - minIndex, n - maxIndex);
        int option3 = Math.min(minIndex, maxIndex) + 1 + n - Math.max(minIndex, maxIndex);

        return Math.min(option1, Math.min(option2, option3));
    }
}