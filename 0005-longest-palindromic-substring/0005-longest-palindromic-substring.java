class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 0)
            return "";

        String ans = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j > i; j--) {
                if (s.charAt(i) != s.charAt(j)) {
                    continue;
                }
                String sub = s.substring(i, j + 1);
                if (palindrome(sub)) {
                    if (sub.length() > ans.length()) {
                        ans = sub;
                    }
                }
            }
        }

        return ans;
    }

    public boolean palindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}