class Solution {
public:
    bool sumGame(string num) {
        int leftSum = 0;
        int leftCount = 0;

        // Left half
        for (int i = 0; i < num.length() / 2; i++) {
            char ch = num[i];

            if (ch == '?')
                leftCount++;
            else
                leftSum += (ch - '0');
        }

        int rightSum = 0;
        int rightCount = 0;

        // Right half
        for (int i = num.length() / 2; i < num.length(); i++) {
            char ch = num[i];

            if (ch == '?')
                rightCount++;
            else
                rightSum += (ch - '0');
        }

        int diff = leftSum - rightSum;
        return 2 * (leftSum - rightSum) != 9 * (rightCount - leftCount);
    }
};