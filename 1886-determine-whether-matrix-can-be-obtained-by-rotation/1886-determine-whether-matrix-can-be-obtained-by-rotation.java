class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int count = 4;

        while(count >= 0){
            rotate90(mat);
            if(Arrays.deepEquals(mat, target)){
                return true;
            }
            count--;
        }
        return false;
    }

    public void rotate90(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=i+1; j<matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0; i<matrix.length; i++){
            reverse(matrix[i]);
        }
    }

    public void reverse(int[] row){
        int i=0; 
        int j=row.length-1;

        while(i < j){
            int temp = row[i];
            row[i] = row[j];
            row[j] = temp;

            i++;
            j--;
        }
    }
}