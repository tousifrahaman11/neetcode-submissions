class Solution {
    List<List<Integer>> li = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> cur = new ArrayList<>();
        solve(nums, 0, cur);
        return li;
    }
     void solve(int[] nums, int idx, List<Integer> cur){
        if(idx == nums.length){
            li.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[idx]);
        solve(nums, idx+1, cur);
        cur.remove(cur.size()-1);
        solve(nums, idx+1, cur);
    }
}
