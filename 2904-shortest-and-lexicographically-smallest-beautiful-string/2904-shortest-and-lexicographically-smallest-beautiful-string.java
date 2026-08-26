class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String best = "";
        int count = 0;
        int len = Integer.MAX_VALUE;
        int left = 0;

        for(int right=0; right<s.length(); right++){
            char ch = s.charAt(right);

            if(ch == '1') count++;

            while (count > k) {
                if (s.charAt(left) == '1') {
                    count--;
                }
                left++;
            }

            if(count == k){

                while (s.charAt(left) == '0') {
                    left++;
                }

                String current = s.substring(left, right + 1);
                int cLen = current.length();

                if(cLen < len){
                    len = cLen;
                    best = current;
                }else if (cLen == len && current.compareTo(best) < 0) {
                    best = current;
                }
            }
        }
        return best;
    }
}