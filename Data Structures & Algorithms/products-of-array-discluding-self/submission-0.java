class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        for(int i = 0; i< nums.length; i++){
            int pr = 1;
            for(int j = 0; j<nums.length; j++){
                if(i!=j){
                    pr *= nums[j];
                }
            }
            res[i] = pr;
        }
        return res;
    }
}  
