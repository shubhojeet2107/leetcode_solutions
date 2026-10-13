class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] squares = new long[nums.length];

        for(int i = 0; i < nums.length; i++){
            squares[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(squares);
        int n = nums.length;
        long sum = 0;

        for(int i=0; i<n; i++){
            long square = (long)nums[i] * nums[i];

            if(i < (n/2)) sum -= squares[i];
            else sum += squares[i];
        }

        return sum;
    }
}