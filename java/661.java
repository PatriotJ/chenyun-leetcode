class Solution {
    public int[][] imageSmoother(int[][] M) {
        int m = M.length;
        if(m == 0){
            return M;
        }
        int n = M[0].length;
        if(n == 0){
            return M;
        }
        int[][] ans = new int[m][n];
        for(int i = 0;i <m;i++){
            for(int j = 0 ;j<n;j++){
                ans[i][j] = smooth(M,i,j);
            }
        }
        return ans;
    }
    
    public int smooth(int[][] M,int m,int n){
        int sum = 0,total = 0;
        for(int i = m - 1; i < m+2;i ++){
            for(int j = n - 1; j < n+2;j ++){
                if( i >=0 && i < M.length && j >= 0 && j < M[0].length){
                    sum += M[i][j];
                    total ++;
                }
            }
        }
        return sum/total;
    }
}