class Solution {
    public int searchInsert(int[] nums, int target) {
        int st = nums.length;
        int l = 0;
        int r = nums.length-1;
        while(l<=r){
            int md = l + (r-l)/2;
            if(nums[md] >= target){
                st = md;
                r = md-1;
            } else{
                l = md+1;
            }
        }
        return st;
    }
}