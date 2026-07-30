class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int ans = 0;
        int press = 1;

        while (n > 0) {
            int take = Math.min(8, n);
            ans += take * press;
            n -= take;
            press++;
        }

        return ans;
    }
}