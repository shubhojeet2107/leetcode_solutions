class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], 1);
        }

        int max = 0;
        for(int i=0; i<nums.length; i++){
            max = Math.max(nums[i], max);
        }

        for(int i=k; i<=max; i+=k){
            if(!map.containsKey(i)) return i;
        }

        return ((max/k) + 1) * k;
    }
}