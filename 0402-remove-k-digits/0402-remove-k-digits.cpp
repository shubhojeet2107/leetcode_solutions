class Solution {
public:
    string removeKdigits(string num, int k) {
        stack<int> st;

        // Store indices in the stack
        for (int i = 0; i < num.length(); i++) {

            while (!st.empty() &&
                   k > 0 &&
                   num[i] < num[st.top()]) {

                st.pop();
                k--;
            }

            st.push(i);
        }

        // If k is still remaining, remove from the end
        while (k > 0 && !st.empty()) {
            st.pop();
            k--;
        }

        // Build the number from remaining indices
        string str = "";

        while (!st.empty()) {
            int index = st.top();
            st.pop();

            str += num[index];
        }

        // Stack gives us the digits backwards
        reverse(str.begin(), str.end());

        // Remove leading zeroes
        string result = "";
        bool foundNonZero = false;

        for (int i = 0; i < str.length(); i++) {

            if (str[i] != '0') {
                foundNonZero = true;
            }

            if (foundNonZero) {
                result += str[i];
            }
        }

        // If nothing remains, answer is "0"
        if (result.empty()) {
            return "0";
        }

        return result;
    }
};