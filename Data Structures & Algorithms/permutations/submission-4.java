class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        solve(nums, li, 0);
        return li;
    }
    static void solve(int[] nums, List<List<Integer>> li, int idx){
        if(idx == nums.length){
            List<Integer> l1 = new ArrayList<>();
            for(int nm : nums) l1.add(nm);
            li.add(l1);
        }
        for(int i = idx; i<nums.length; i++){
            swap(nums, i, idx);
            solve(nums,li, idx+1);
            swap(nums, i, idx);
        }
    }
    static void swap(int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
