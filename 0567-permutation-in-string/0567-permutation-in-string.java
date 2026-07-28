class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int size1 = s1.length();
        int size2 = s2.length();

        if(size2 < size1) return false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i=0; i<size1; i++){
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(arr1, arr2)) return true;

        for(int i=size1; i<size2; i++){
            arr2[s2.charAt(i) - 'a']++;
            arr2[s2.charAt(i-size1) - 'a']--;

            if(Arrays.equals(arr1, arr2)) return true;
        }

        return false;
    }
}