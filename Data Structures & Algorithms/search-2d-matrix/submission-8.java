class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i<n; i++){
            int l = 0, r = m-1;

            while(l<=r){
                int md = l+(r-l)/2;
                if(matrix[i][md] == target){
                    return true;
                } else if(matrix[i][md] < target){
                    l = md+1;
                } else{
                    r = md-1;
                }
            }
        }
        return false;
    }
}
