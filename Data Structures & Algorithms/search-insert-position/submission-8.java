class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length-1;

        while(l<=r){
            int md = l + (r-l)/2;

            if(nums[md] == target){
                return md;
            }else if(nums[md] < target){
                l = md+1;
            } else{
                r = md-1;
            }
        }
        return l;
    }
}