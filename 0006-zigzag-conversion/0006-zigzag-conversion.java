class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;

        StringBuilder[] arr = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            arr[i] = new StringBuilder();
        }

        boolean down = true;
        int row = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            arr[row].append(ch);

            if(row == numRows-1) down = false;
            if(row == 0) down = true;

            if(!down) row--;
            if(down) row++;
        }

        StringBuilder result = new StringBuilder();
        for(int i=0; i<numRows; i++){
            result.append(arr[i]);
        }

        return result.toString();
    }
}