class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split(" ");
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            boolean can = true;

            for(int j=0; j<brokenLetters.length(); j++) {
                char ch = brokenLetters.charAt(j);

                if(arr[i].contains(String.valueOf(ch))) {
                    can = false;
                    break;
                }
            }
            if(can) count++;
        }

        return count;
    }
}