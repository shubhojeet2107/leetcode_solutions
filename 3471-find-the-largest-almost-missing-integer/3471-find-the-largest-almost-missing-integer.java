class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        if(k == 1) {
            int ans = -1;
            for (int i = 0; i < nums.length; i++) {
                if (map.get(nums[i]) == 1) {
                    ans = Math.max(ans, nums[i]);
                }
            }
            return ans;
        }

        if(k == nums.length) {
            int ans = nums[0];
            for (int i = 1; i < nums.length; i++) {
                ans = Math.max(ans, nums[i]);
            }
            return ans;
        }

        int first = nums[0];
        int last = nums[nums.length - 1];

        if (map.get(first) == 1 && map.get(last) == 1)
            return Math.max(first, last);
        else if (map.get(first) == 1)
            return first;
        else if (map.get(last) == 1)
            return last;

        return -1;
    }
}