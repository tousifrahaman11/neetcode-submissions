class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int tot = 0;
        int cm = 0, ms = Integer.MIN_VALUE;
        int cmn = 0, msm = Integer.MAX_VALUE;

        for (int nm : nums) {
            tot += nm;

            cm = Math.max(nm, cm + nm);
            ms = Math.max(ms, cm);

            cmn = Math.min(nm, cmn + nm);
            msm = Math.min(msm, cmn);
        }

        if (ms < 0) {
            return ms;
        }

        return Math.max(ms, tot - msm);
    }
}