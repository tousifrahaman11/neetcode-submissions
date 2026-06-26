class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int df = target-nums[i];

            if(mp.containsKey(df)){
                return new int[]{mp.get(df), i};
            }
            mp.put(nums[i], i);
        }
        return new int[]{};
    }
}
