class Solution {
    public int minFallingPathSum(int[][] A) {
        int m = A.length;
        if(m == 1){
            return A[0][0];
        }
        int[][] dp = new int[m][m];
        for(int i = 0;i < m;i++){
            dp[0][i] = A[0][i];
        }
        for(int i = 1;i < m;i++){
            for(int j = 0;j < m;j++){
                if(j == 0){
                    dp[i][j] = Math.min(dp[i-1][j],dp[i-1][j+1])+A[i][j];
                }else if(j == m-1){
                    dp[i][j] = Math.min(dp[i-1][j],dp[i-1][j-1])+A[i][j];
                }else{
                    dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i-1][j+1]),dp[i-1][j-1])+A[i][j];
                }
            }
        }
        int ans = dp[m-1][0];
        for(int i = 1;i<m;i++){
            ans = Math.min(ans,dp[m-1][i]);
        }
        return ans;
    }
}