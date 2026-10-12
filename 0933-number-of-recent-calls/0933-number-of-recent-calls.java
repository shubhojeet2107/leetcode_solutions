class RecentCounter {
    Queue<Integer> queue = new LinkedList<>();
    int counter;

    public RecentCounter() {
       this.counter = 0;
    }
    
    public int ping(int t) {
        int[] range = new int[2];
        range[0] = (t - 3000);
        range[1] = t;

        queue.offer(t);

        while(queue.peek() < range[0]){
            queue.poll();
        }
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */