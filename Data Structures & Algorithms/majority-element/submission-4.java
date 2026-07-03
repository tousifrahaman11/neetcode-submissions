class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int rc = 0, mxc = 0 ; //mxc = maxm count

        for(int nm : nums){
            mp.put(nm, mp.getOrDefault(nm,0)+1);

            if(mp.get(nm) > mxc){
                rc = nm;
                mxc = mp.get(nm);
            }
        }
        return rc;
    }
}