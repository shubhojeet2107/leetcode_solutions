class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(mapS.containsKey(ch)){
                mapS.put(ch, mapS.get(ch) + 1);
            }else{
                mapS.put(ch, 1);
            }
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(mapT.containsKey(ch)){
               mapT.put(ch, mapT.get(ch) + 1);
            }else{
                mapT.put(ch, 1);
            }
        }

        if(mapS.equals(mapT)){
            return true;
        }else{
            return false;
        }
    }
}