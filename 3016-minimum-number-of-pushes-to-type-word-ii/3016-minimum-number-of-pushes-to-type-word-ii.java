class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for(int i=0; i<word.length(); i++){
            freq[word.charAt(i) - 'a']++;
        }

        Arrays.sort(freq);

        int count = 0;
        int press = 1;
        int ans = 0;
        for(int i=freq.length-1; i>=0; i--){
            if(freq[i] == 0) break;
            
            if(count == 8){
                count = 0;
                press++;
            }

            ans += press*freq[i]; 
            count++;
        }

        return ans;
    }
}