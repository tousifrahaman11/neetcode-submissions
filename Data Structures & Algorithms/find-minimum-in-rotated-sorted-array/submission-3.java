class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        int l = 0, r = nums.length-1;

        while(l<r){
            int md = l+(r-l)/2;
            if(nums[md] == nums[0]){
                return nums[0];
            } else if(nums[md] < nums[0]){
                l = md+1;
            } else{
                r = md-1;
            }
        }
        return nums[l];
    }
}
