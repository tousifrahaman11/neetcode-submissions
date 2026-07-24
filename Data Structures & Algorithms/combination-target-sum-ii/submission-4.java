class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(candidates);
        solve(0, candidates, target, new ArrayList<>(), li);
        return li;
    }
    static void solve(int idx, int[] candidates, int target, List<Integer> cur , List<List<Integer>> li){
        if(target == 0){
            li.add(new ArrayList<>(cur));
            return;
        }
        if(idx == candidates.length || target < 0){
            return;
        }
        int nx = idx+1;
        while(nx<candidates.length && candidates[nx] == candidates[nx-1]){
            nx++;
        }
        if(candidates[idx] <= target){
            cur.add(candidates[idx]);
            solve(idx+1, candidates, target-candidates[idx], cur, li);
            cur.remove(cur.size()-1);
        }
    solve(nx, candidates, target, cur, li);
    }
}
