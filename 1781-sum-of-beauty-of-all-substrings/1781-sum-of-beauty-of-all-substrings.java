class Solution {
    public int beautySum(String s) {
        int ans = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            for (int j = i + 2; j < s.length(); j++) {
                ans += frequency(s.substring(i, j + 1));
            }
        }

        return ans;
    }

    public int frequency(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : freq) {
            if (i > 0) {
                min = Math.min(i, min);
                max = Math.max(i, max);
            }
        }

        return max - min;
    }
}