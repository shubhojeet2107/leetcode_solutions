class Solution {
    public int maxChunksToSorted(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<arr.length; i++){
            if(stack.isEmpty() || arr[i] >= stack.peek()){
                stack.push(arr[i]);
            }
            else{
                int max = 0;
                while(!stack.isEmpty() && stack.peek() > arr[i]){
                    max = Math.max(max, stack.peek());
                    stack.pop();
                }

                stack.push(max);
            }
        }

        return stack.size();
    }
}