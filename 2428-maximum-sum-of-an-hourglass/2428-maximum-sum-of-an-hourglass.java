class Solution {
    public int maxSum(int[][] matrix) {
        int best = Integer.MIN_VALUE;
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i=0; i<row-2; i++){
            for(int j=0; j<col-2; j++){
                int ans = matrix[i][j] + matrix[i][j+1] + matrix[i][j+2] + matrix[i+1][j+1] + matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];

                best = Math.max(ans, best);
            }
        }

        return best;
    }
}