class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int prefix[] = new int[arr.length+1];
        prefix[0] = 0;

        for(int i=0; i<arr.length; i++){
            prefix[i+1] = prefix[i] + arr[i];
        }

        int sum = 0;

        for(int len = 1; len <= arr.length; len+=2){
            for(int start = 0; start+len <= arr.length; start++){
                int end = start+len - 1;

                sum += prefix[end+1] - prefix[start];
            }
        }

        return sum;
    }
}