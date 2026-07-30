class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length;
        int cols = grid[0].length;
        int total = row*cols;

        int ans[][] = new int[row][cols];
        k %= total;

        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){

                int index = (i*cols) + j;
                int newIndex = (index + k) % total;

                int newRow = newIndex / cols;
                int newCols = newIndex % cols;

                ans[newRow][newCols] = grid[i][j];
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<row; i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<cols; j++){
                list.add(ans[i][j]);
            }
            result.add(list);
        }

        return result;
    }
}