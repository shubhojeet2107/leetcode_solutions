class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> str = new ArrayList<>();

        int i = 0;
        while (i < (nums.length)) {
            int start = nums[i];
            while (i < (nums.length-1) && (nums[i + 1] - nums[i]) == 1) {
                i++;
            }

            int end = nums[i];

            if(start == end){
                str.add(String.valueOf(start));
            }else{
                str.add(start +"->"+ end);
            }

            i++;
        }
        return str;
    }
}