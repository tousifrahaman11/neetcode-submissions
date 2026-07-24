class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        solve(0, nums, li, new ArrayList<>());
        return li;
    }
    static void solve(int idx, int[] nums, List<List<Integer>> li, List<Integer> l1){
        if(idx == nums.length){
            li.add(new ArrayList<>(l1));
            return;
        }
        l1.add(nums[idx]);
        solve(idx+1, nums, li, l1);
        l1.remove(l1.size()-1);
        solve(idx+1, nums, li, l1);
    }
}
