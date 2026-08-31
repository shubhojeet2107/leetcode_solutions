class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[prices.length];

        for(int i=0; i<prices.length; i++){
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
                int index = stack.pop();
                result[index] = prices[index] - prices[i];
            }

            stack.push(i);
        }

        while(!stack.isEmpty()){
           int index = stack.pop();
           result[index] = prices[index];
        }

        return result;
    }
}