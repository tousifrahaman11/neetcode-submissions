class Solution {
    public int majorityElement(int[] nums) {
        for(int nm : nums){
            int c = 0;
            for(int i : nums){
                if(i == nm) {
                    c++;
                }
            }
            if(c > nums.length/2){
                return nm;
            }
        }
        return 0;
    }
}