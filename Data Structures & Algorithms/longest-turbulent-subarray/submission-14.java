class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        int lf = 0;
        int res = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                lf = i;
            } else if (i >= 2) {
                boolean prev = arr[i -2] < arr[i-1];
                boolean curr = arr[i - 1] < arr[i];
                if (prev == curr) {
                    lf = i-1;
                }
            }
        res = Math.max(res, i - lf + 1);
        }
      return res;
    }
}