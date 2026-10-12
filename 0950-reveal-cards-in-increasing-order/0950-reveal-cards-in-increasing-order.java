class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Deque<Integer> queue = new ArrayDeque<>();

        Arrays.sort(deck);

        for(int i=deck.length-1; i>=0; i--){
            if(!queue.isEmpty()){
                queue.offerFirst(queue.pollLast());
            }
            queue.offerFirst(deck[i]);
        }

        int[] result = new int[queue.size()];
        int i = 0;
        while(!queue.isEmpty()){
            result[i] = queue.pollFirst();
            i++;
        }

        return result;
    }
}