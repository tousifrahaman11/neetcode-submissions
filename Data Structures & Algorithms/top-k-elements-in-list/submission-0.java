class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] -b[0]);

        for(Map.Entry<Integer, Integer> ent : mp.entrySet()){
            int num = ent.getKey();
            int count = ent.getValue();
            pq.offer(new int[]{count, num});
            //maintain heap size
            if(pq.size() > k){
                pq.poll();
            }
        }
        int res[] = new int[k];
        int idx = 0;
        while(!pq.isEmpty()){
            int[] pair = pq.poll();
            res[idx] = pair[1];
            idx++;
        }
        return res;
    }
}
 