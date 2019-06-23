class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length;
        if(m == 0){
            return nums;
        }
        int n = nums[0].length;
        if(n == 0){
            return nums;
        }
        if(m * n != r*c){
            return nums;
        }
        int k = 0,v = 0;
        int[][] mat = new int[r][c];
        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                mat[i][j] = nums[k][v++];
                if(v == n){
                    k ++;
                    v = 0;
                }
            }
        }
        return mat;
    }
}