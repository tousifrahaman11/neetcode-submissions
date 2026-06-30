class Solution {
    public int jump(int[] nums) {
        int jm = 0;
        int fr = 0;
        int curE = 0;

        for(int i = 0; i<nums.length-1; i++){
            fr = Math.max(fr, i+nums[i]);
            if(i == curE){
                jm++;
                curE = fr;
            }
        }
        return jm;
    }
}
