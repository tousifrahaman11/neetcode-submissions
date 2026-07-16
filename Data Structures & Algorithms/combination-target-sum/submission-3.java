class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> li = new ArrayList<>();
        back(0, nums, target, new ArrayList<>(), li);
        return li;
    }
    static void back(int idx, int[] nums, int target, List<Integer> cur, List<List<Integer>> li){
        if(target == 0){
            li.add(new ArrayList<>(cur));
            return;
        }
        if(target < 0) return;

        for(int i = idx; i < nums.length; i++){
            cur.add(nums[i]);
            back(i, nums, target-nums[i], cur, li);
            cur.remove(cur.size()-1);
        }
    }
}
