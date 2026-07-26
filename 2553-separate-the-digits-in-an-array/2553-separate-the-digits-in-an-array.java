class Solution {
    public int[] separateDigits(int[] nums) {
        if(nums.length == 1) return nums;
        
        ArrayList<Integer> list = new ArrayList<>();
        int j = 0;

        while (j < nums.length) {
            recursive(list, nums[j]);
            j++;
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

    public void recursive(ArrayList<Integer> list, int num) {
        if (num == 0)
            return;
        recursive(list, num / 10);
        list.add(num % 10);
    }
}