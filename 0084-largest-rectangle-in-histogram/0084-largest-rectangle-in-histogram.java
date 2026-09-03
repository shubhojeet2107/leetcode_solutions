class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for(int i=0; i<=heights.length; i++){
            int currHeight;
            if(i == heights.length) currHeight = 0;
            else currHeight = heights[i];

            while(!stack.isEmpty() && heights[stack.peek()] > currHeight){
                int h = heights[stack.pop()];

                int width;

                if(stack.isEmpty()) width = i;
                else width = (i - stack.peek() - 1);

                int area = (width * h);
                maxArea = Math.max(area, maxArea);
            }

            if(i < heights.length) stack.push(i);
        }

        return maxArea;
    }
}