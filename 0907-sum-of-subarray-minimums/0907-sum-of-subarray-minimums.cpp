class Solution {
public:
    int sumSubarrayMins(vector<int>& arr) {
        long long MOD = 1000000007LL;
        vector<int> left = PSE(arr);
        vector<int> right = NSE(arr);

        long long sum = 0;

        for(int i=0; i<arr.size(); i++){
            long long contribution = 1LL * arr[i] * (i - left[i]) * (right[i] - i);
            sum = (sum + contribution) % MOD;
        }

        return (int)sum;
    }

    vector<int> PSE(vector<int>& arr){
        stack<int> stack;
        vector<int> left(arr.size());

        for(int i=0; i<arr.size(); i++){
            while(!stack.empty() && arr[stack.top()] >= arr[i]){
                stack.pop();
            }

            if(stack.empty()) left[i] = -1;
            else left[i] = stack.top();

            stack.push(i);
        }

        return left;
    }

    vector<int> NSE(vector<int>& arr){
        stack<int> stack;
        vector<int> right(arr.size());

        for(int i=arr.size()-1; i>=0; i--){
            while(!stack.empty() && arr[stack.top()] > arr[i]){
                stack.pop();
            }

            if(stack.empty()) right[i] = arr.size();
            else right[i] = stack.top();

            stack.push(i);
        }

        return right;
    }
};