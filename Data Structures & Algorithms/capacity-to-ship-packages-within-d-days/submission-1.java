class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int h = 0;
        for ( int w : weights){
           l = Math.max(l,w);
           h+=w;
        }

        while (l < h){
            int mid = ( l + h)/2;
            int dn=1, cw=0;

            for (int w : weights){
                if ( cw + w > mid ){
                    dn++;
                    cw = 0;
                }
                cw += w;
            }
            if ( dn > days){
                l = mid +1 ;
            }else {
                h = mid ;
            }

        }
        return l;
    }
}