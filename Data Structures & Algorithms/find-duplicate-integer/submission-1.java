class Solution {
    public int findDuplicate(int[] nums) {
        int fs = 0,  sl = 0;
        while(true){
            sl = nums[sl];
            fs = nums[nums[fs]];
            if(sl == fs) break;
        }
        int sl2 = 0;
        while(true){
            sl = nums[sl];
            sl2 = nums[sl2];
            if(sl == sl2) return sl;
        }
    }
}
