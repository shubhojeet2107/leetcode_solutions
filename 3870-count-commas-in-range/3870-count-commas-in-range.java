class Solution {
    public int countCommas(int num) {
        int count = 0;
        int place = 1000;

        while(num >= place){
            count += (num - place + 1);

            place *= place;
        }

        return count;
    }
}