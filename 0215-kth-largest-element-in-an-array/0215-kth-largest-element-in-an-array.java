class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<nums.length; i++){
            pq.offer(nums[i]);
        }

        int count = 0;
        while(!pq.isEmpty()){
            int num = pq.poll();
            count++;

            if(count == k) return num;
        }

        return -1;
    }
}