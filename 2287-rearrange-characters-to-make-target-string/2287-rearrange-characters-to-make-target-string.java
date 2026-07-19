class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
        }

        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i=0; i<target.length(); i++){
            map2.put(target.charAt(i), map2.getOrDefault(target.charAt(i), 0) + 1);
        }

        int ans = Integer.MAX_VALUE;
        for(char ch : map2.keySet()){
            int available = map1.getOrDefault(ch, 0);
            int tar = map2.get(ch);

            ans = Math.min(ans, available/tar);
        }

        return ans;
    }
}