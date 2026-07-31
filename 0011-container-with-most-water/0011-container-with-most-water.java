class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int start = 0;
        int end = height.length-1;

        while(end > start){
            ans = Math.max(ans, ((Math.min(height[start], height[end]) * (end - start))));

            if(height[end] > height[start]) start++;
            else end--;
        }

        return ans;
    }
}