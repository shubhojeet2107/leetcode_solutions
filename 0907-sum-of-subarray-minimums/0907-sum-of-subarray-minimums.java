class Solution {
    public int sumSubarrayMins(int[] arr) {
        long MOD = 1000000007L;
        int[] left = PSE(arr);
        int[] right = NSE(arr);

        long sum = 0;

        for(int i=0; i<arr.length; i++){
            long contribution = (long)arr[i] * (i - left[i]) * (right[i] - i);
            sum = (sum + contribution) % MOD;
        }

        return (int)sum;
    }

    int[] PSE(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] left = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()) left[i] = -1;
            else left[i] = stack.peek();

            stack.push(i);
        }

        return left;
    }

    int[] NSE(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] right = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()) right[i] = arr.length;
            else right[i] = stack.peek();

            stack.push(i);
        }

        return right;
    }
}   