class Solution {
    public int findLength(int[] A, int[] B) {
        int l = A.length;
        int[][] m = new int[l+1][l+1];
        int max = 0;
        for(int i = 0;i < l;i++){
            for(int j = 0;j < l;j++){
                if(A[i] == B[j]){
                    m[i+1][j+1] = m[i][j] + 1;
                    max= Math.max(max,m[i+1][j+1]);
                }
            }
        }
        return max;
    }
}