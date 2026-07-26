class Solution {
    public int[] separateDigits(int[] nums) {
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (i < nums.length) {
            String str = Integer.toString(nums[i]);
            int j = 0;
            while (j < str.length()) {
                char ch = str.charAt(j);
                list.add(ch - '0');
                j++;
            }
            i++;
        }

        int[] arr = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            arr[k] = list.get(k);
        }

        return arr;
    }
}