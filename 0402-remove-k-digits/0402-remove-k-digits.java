class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<num.length(); i++){
            while(!stack.isEmpty() && k>0 && num.charAt(i) < num.charAt(stack.peek())){
                stack.pop();
                k--;
            }

            stack.push(i);
        }

        while(k > 0){
                stack.pop();
                k--;
        }

        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty()){
            int index = stack.pop();
            str.append(num.charAt(index));
        }

        str.reverse();

        StringBuilder result = new StringBuilder();
        boolean foundNonZero = false;

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != '0') {
                foundNonZero = true;
            }

            if (foundNonZero) {
                result.append(ch);
            }
        }

        // If everything was zero, return "0"
        if (result.length() == 0) {
            return "0";
        }

        return result.toString();
    }
}