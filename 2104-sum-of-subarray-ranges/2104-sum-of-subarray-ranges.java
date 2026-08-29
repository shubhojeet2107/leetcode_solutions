class Solution {
    public long subArrayRanges(int[] nums) {
        return max(nums) - min(nums);
    }

    long max(int[] nums){
        long maxSum = 0;
        int left[] = PGE(nums);
        int right[] = NGE(nums);

        for(int i=0; i<nums.length; i++){
            long contribution = (long)nums[i] * (i - left[i]) * (right[i] - i);
            maxSum += contribution;
        }

        return maxSum;
    }

    int[] PGE(int[] nums){
        Stack<Integer> stack = new Stack<>();
        int[] left = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            while(!stack.isEmpty() && nums[stack.peek()] <= nums[i]){
                stack.pop();
            }

            if(stack.isEmpty()) left[i] = -1;
            else left[i] = stack.peek();

            stack.push(i);
        }

        return left;
    }

    int[] NGE(int[] nums){
        Stack<Integer> stack = new Stack<>();
        int[] right = new int[nums.length];

        for(int i=nums.length-1; i>=0; i--){
            while(!stack.isEmpty() && nums[i] > nums[stack.peek()]){
                stack.pop();
            }

            if(stack.isEmpty()) right[i] = nums.length;
            else right[i] = stack.peek();

            stack.push(i);
        }

        return right;
    }

    long min(int[] nums){
        long minSum = 0;
        int[] left = PSE(nums);
        int[] right = NSE(nums);

        for(int i=0; i<nums.length; i++){
            long contribution = (long)nums[i] * (i - left[i]) * (right[i] - i);
            minSum += contribution;
        }

        return minSum;
    }

    int[] PSE(int[] nums){
        Stack<Integer> stack = new Stack<>();
        int[] left = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            while(!stack.isEmpty() && nums[stack.peek()] >= nums[i]){
                stack.pop();
            }

            if(stack.isEmpty()) left[i] = -1;
            else left[i] = stack.peek();

            stack.push(i);
        }

        return left;
    }

    int[] NSE(int[] nums){
        Stack<Integer> stack = new Stack<>();
        int[] left = new int[nums.length];

        for(int i=nums.length-1; i>=0; i--){
            while(!stack.isEmpty() && nums[stack.peek()] > nums[i]){
                stack.pop();
            }

            if(stack.isEmpty()) left[i] = nums.length;
            else left[i] = stack.peek();

            stack.push(i);
        }

        return left;
    }
}