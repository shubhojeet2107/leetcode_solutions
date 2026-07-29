class Solution {
    public String smallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        StringBuilder left = new StringBuilder();
        StringBuilder mid = new StringBuilder();

        int i = 0;
        while(i < s.length()){
            int j = i;

            while(j < s.length() && arr[i] == arr[j]) {
                j++;
            }

            int count = j-i;
            for(int k=0; k<count/2; k++){
                left.append(arr[i]);
            }

            if(count % 2 == 1){
                mid.append(arr[i]);
            }

            i=j;
        }

        StringBuilder ans = new StringBuilder();
        ans.append(left);
        ans.append(mid);
        ans.append(left.reverse());
        return ans.toString();
    }
}