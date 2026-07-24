class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(nums);
        solve(0, nums, li, new ArrayList<>());
        return li;
    }
    static void solve(int idx, int[] nums, List<List<Integer>> li, List<Integer> cur){
        if(idx == nums.length){
            li.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[idx]);
        solve(idx+1,nums, li, cur );
        cur.remove(cur.size()-1);

        int nxt = idx+1;
        while(nxt < nums.length && nums[nxt] == nums[nxt-1]){
            nxt++;
        }

        solve(nxt, nums, li, cur);
    }
}
