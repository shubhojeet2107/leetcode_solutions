class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        // int num = nums[0];
        int ans = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1] + 1) break;
            ans += nums[i];
        }

        while(set.contains(ans)){
            ans++;
        }

        return ans;
    }
}