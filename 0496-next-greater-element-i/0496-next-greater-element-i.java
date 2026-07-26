class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums2.length; i++){
            while(!stack.isEmpty() && nums2[i] > stack.peek()){
                int popped = stack.pop();
                map.put(popped, nums2[i]);
            }
            stack.push(nums2[i]);
        }

        int[] arr = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            arr[i] = map.getOrDefault(nums1[i], -1);
        }

        return arr;
    }
}