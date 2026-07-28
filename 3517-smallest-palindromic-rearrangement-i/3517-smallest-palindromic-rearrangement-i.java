class Solution {
    public String smallestPalindrome(String s) {
        if (s.length() <= 1) return s;

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        StringBuilder left = new StringBuilder();
        StringBuilder middle = new StringBuilder();

        int i = 0;

        while (i < arr.length) {
            int j = i;

            while (j < arr.length && arr[j] == arr[i]) {
                j++;
            }

            int count = j - i;

            for (int k = 0; k < count / 2; k++) {
                left.append(arr[i]);
            }

            if (count % 2 == 1) {
                middle.append(arr[i]);
            }

            i = j;
        }

        StringBuilder ans = new StringBuilder();
        ans.append(left);
        ans.append(middle);
        ans.append(left.reverse());

        return ans.toString();
    }
}