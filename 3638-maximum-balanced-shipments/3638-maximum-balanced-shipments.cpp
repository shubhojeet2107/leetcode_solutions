class Solution {
public:
    int maxBalancedShipments(vector<int>& weight) {
        int count = 0;
        int mx = INT_MIN;

        for(int i=0; i<weight.size(); i++){
            mx = max(mx, weight[i]);

            if(weight[i] < mx){
                count++;
                mx = INT_MIN;
            }
        }

        return count;
    }
};