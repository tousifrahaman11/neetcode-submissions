class Solution {
    public int maxArea(int[] heights) {
        int ans = 0;
        int l = 0, r = heights.length-1;

        while(l<r){
            int res = Math.min(heights[l], heights[r]) *(r-l);
            ans = Math.max(ans, res);

            if(heights[l] <= heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return ans;
    }
}
