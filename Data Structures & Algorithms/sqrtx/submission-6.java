class Solution {
    public int mySqrt(int x) {
        int l = 0, r = x;
        while(l <= r){
            int md = l+(r-l)/2;
            long sq = (long) md*md;

            if(sq > x){
                r = md-1;
            } else if(sq < x){
                l = md+1;
            }else {
                return md;
            }
        }
        return r;
    }
}