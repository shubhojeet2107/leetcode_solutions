class Solution {
    public int lastRemaining(int n) {
        return recursive(n, 1, 1, true);
    }

    int recursive(int n, int head, int step, boolean leftToRight) {
        if (n == 1) {
            return head;
        }

        if (leftToRight || n % 2 == 1) {
            head = head + step;
        }
        
        return recursive(n / 2, head, step * 2, !leftToRight);
    }
}