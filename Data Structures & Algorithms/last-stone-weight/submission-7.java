class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int st : stones){
            pq.add(st);
        }

        while(pq.size() > 1){
            int x = pq.peek();
            pq.poll();

            int y = pq.peek();
            pq.poll();

            if(x!=y){
                pq.add(x-y);
            }
        }
        return pq.isEmpty() ? 0 : Math.abs(pq.peek());
    }
}
