class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int k = A.length;
        if(k == 0){
            return A;
        }
        int v = A[0].length;
        int[][] R = new int[k][v];
        for(int i = 0;i < k;i++){
            for(int j = v - 1;j >= 0;j --){
                R[i][v-j-1] = 1 - A[i][j];
            }
        }
        return R;
    }
}