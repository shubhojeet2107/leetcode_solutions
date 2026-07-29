class Solution {
public:
    int sumOddLengthSubarrays(vector<int>& arr) {
        vector<int> prefix(arr.size() + 1, 0);
        for(int i=0; i<arr.size(); i++){
            prefix[i+1] = prefix[i] + arr[i];
        }

        int sum=0;
        for(int len = 1; len <= arr.size(); len += 2){
            for(int start = 0; start+len <= arr.size(); start++){
                int end = start+len - 1;

                sum += prefix[end+1] - prefix[start];
            }
        }

        return sum;
    }
};