class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length-1;
        int temp = nums[start];

        while(start <= end){
            if(temp != nums[start]){
                while(temp != nums[start]){
                    list.add(temp);
                    temp++;
                }
            }
            temp++;
            start++;
        }

        return list;
    }
}