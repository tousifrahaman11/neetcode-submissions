class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;

        for(int nm : piles){
            r = Math.max(r, nm);
        }
        int res = r;

        while(l <= r){
            int md = l+(r-l)/2;

            int hrs = 0;

            for(int nm1 : piles){
                hrs += (nm1 +md-1)/md;
            }
            if(hrs <= h){
                res = md;
                r = md-1;
            } else{
                l = md+1;
            }
        }
        return res;
    }
}
