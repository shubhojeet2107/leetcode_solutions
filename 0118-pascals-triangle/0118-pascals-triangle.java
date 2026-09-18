class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        result = generate(numRows - 1);

        List<Integer> current = new ArrayList<>();
        current.add(1);

        if(numRows > 1){
            List<Integer> prev = result.get(result.size() - 1);
            for(int i=1; i<prev.size(); i++){
                current.add(prev.get(i-1) + prev.get(i));
            }
            current.add(1);
        }

        result.add(current);

        return result;
    }
}