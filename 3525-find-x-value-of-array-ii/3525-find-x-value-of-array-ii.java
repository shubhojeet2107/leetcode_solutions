class Solution {
    int k;
    Node[] tree;
    class Node {
        int product;
        long[] count;

        Node() {
            count = new long[k];
        }
    }

    public int[] resultArray(int[] nums, int k, int[][] queries) {
        this.k = k;
        int n = nums.length;
        tree = new Node[4 * n];

        build(nums, 0, 0, n - 1);

        int[] result = new int[queries.length];

        for(int q = 0; q < queries.length; q++) {

            int index = queries[q][0];
            int value = queries[q][1];
            int start = queries[q][2];
            int x = queries[q][3];

            // Update
            update(0, 0, n - 1, index, value);

            // Query
            Node temp = query(0, 0, n - 1, start, n - 1);

            result[q] = (int)temp.count[x];
        }

        return result;
    }

    void build(int[] nums, int node, int left, int right) {

        if(left == right) {

            tree[node] = new Node();

            tree[node].product = nums[left] % k;
            tree[node].count[tree[node].product] = 1;

            return;
        }

        int mid = (left + right) / 2;

        build(nums, 2 * node + 1, left, mid);
        build(nums, 2 * node + 2, mid + 1, right);

        tree[node] = merge(
            tree[2 * node + 1],
            tree[2 * node + 2]
        );
    }

    Node merge(Node a, Node b) {

        Node res = new Node();

        res.product = (a.product * b.product) % k;

        for(int r = 0; r < k; r++) {

            res.count[r] += a.count[r];

            int newRemainder = (a.product * r) % k;

            res.count[newRemainder] += b.count[r];
        }

        return res;
    }

    void update(int node, int left, int right,
                int index, int value) {

        if(left == right) {

            tree[node] = new Node();

            tree[node].product = value % k;
            tree[node].count[tree[node].product] = 1;

            return;
        }

        int mid = (left + right) / 2;

        if(index <= mid) {
            update(2 * node + 1, left, mid, index, value);
        }
        else {
            update(2 * node + 2, mid + 1, right, index, value);
        }

        tree[node] = merge(
            tree[2 * node + 1],
            tree[2 * node + 2]
        );
    }

    Node query(int node, int left, int right,
               int ql, int qr) {

        if(right < ql || left > qr) {
            return null;
        }

        if(ql <= left && right <= qr) {
            return tree[node];
        }

        int mid = (left + right) / 2;

        Node a = query(
            2 * node + 1, left, mid, ql, qr
        );

        Node b = query(
            2 * node + 2, mid + 1, right, ql, qr
        );

        if(a == null)
            return b;

        if(b == null)
            return a;

        return merge(a, b);
    }
}