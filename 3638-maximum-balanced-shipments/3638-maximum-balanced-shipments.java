class Solution {
    public int maxBalancedShipments(int[] weight) {
        int count = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<weight.length; i++){
            max = Math.max(max, weight[i]);

            if(weight[i] < max){
                count++;
                max = Integer.MIN_VALUE;
            }
        }

        return count;
    }
}