class Solution {
    public long countCommas(long n) {
        long count = 0L;
        long place = 1000L;

        while(n >= place){
            count += (n - place + 1);

            place *= 1000;
        }

        return count;
    }
}