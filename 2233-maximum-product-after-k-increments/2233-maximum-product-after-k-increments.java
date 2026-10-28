class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            minHeap.offer(nums[i]);
        }

        while(k > 0){
            int num = minHeap.poll();
            minHeap.offer(num += 1);
            k--;
        }

        int result = 1;
        int mod = 1000000007;
        while(!minHeap.isEmpty()){
            int num = minHeap.poll();
            result = (int) ((long) result * num % mod);
        }

        return result;
    }
}