class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr, -1);

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<2*nums.length; i++){
            int index = i % nums.length;
            while(!stack.isEmpty() && nums[stack.peek()] < nums[index]){
                arr[stack.pop()] = nums[index];
            }

            if(i < nums.length) stack.push(i);
        }

        return arr;
    }
}