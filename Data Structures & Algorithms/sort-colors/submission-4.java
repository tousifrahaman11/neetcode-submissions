class Solution {
    public void sortColors(int[] nums) {
        int i = 0, j = 0, r = nums.length - 1;

        while (j <= r) {
            if (nums[j] == 0) {
                swp(nums, i, j);
                i++;
                j++;
            } else if (nums[j] == 2) {
                swp(nums, j, r);
                r--;
            } else {
                j++;
            }
        }
    }

    private void swp(int[] nums, int i, int k) {
        int tmp = nums[i];
        nums[i] = nums[k];
        nums[k] = tmp;
    }
}