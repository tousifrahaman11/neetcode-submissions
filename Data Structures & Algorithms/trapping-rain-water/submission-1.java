class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length-1;
        int lf = height[l], rm = height[r];
        int res = 0;
        while(l<r){
            if(lf<rm){
                l++;
                lf = Math.max(lf, height[l]);
                res += lf-height[l];
            } else{
                r--;
                rm = Math.max(rm, height[r]);
                res += rm- height[r];
            }
        }
        return res;
    }
}
