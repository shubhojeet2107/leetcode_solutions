class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int size1 = s1.length();
        int size2 = s2.length();

        if(size1 > size2) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<size1; i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        int left=0;
        for(int right=size1-1; right<size2; right++){
            HashMap<Character, Integer> tempMap = new HashMap<>(map);

            for (int i = left; i <= right; i++) {
                char ch = s2.charAt(i);

                if(!tempMap.containsKey(ch)) {
                    break;
                }

                tempMap.put(ch, tempMap.get(ch) - 1);

                if(tempMap.get(ch) == 0) {
                    tempMap.remove(ch);
                }
            }
            if(tempMap.isEmpty()) {
                return true;
            }

            left++;
        }
        return false;
    }
}