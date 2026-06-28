class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int mxp = 0;
        while(r<prices.length){
            if(prices[r] > prices[l]){
                int prf = prices[r] - prices[l];
                mxp = Math.max(mxp, prf);
            } else{
                l = r;
            }
            r++;
        }
        return mxp;
    }
}
