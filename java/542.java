class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length;
        if(m == 0){
            return matrix;
        }
        int n = matrix[0].length;
        if(n == 0){
            return matrix;
        }
        
       int[][] dp = new int[m][n];
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                dp[i][j] =  matrix[i][j] != 0 ? Integer.MAX_VALUE-10000:0;
            }
        }
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(matrix[i][j] != 0){
                    if(i > 0){
                        dp[i][j] = Math.min(dp[i][j],dp[i-1][j]+1);
                    }
                    if(j > 0){
                        dp[i][j] = Math.min(dp[i][j],dp[i][j-1]+1);
                    }
                }
            }
        }
        for(int i = m-1;i >= 0;i--){
            for(int j = n-1;j>=0;j--){
                if(i < m - 1){
                    dp[i][j] = Math.min(dp[i][j],dp[i+1][j]+1);
                }
                if(j < n-1){
                    dp[i][j] = Math.min(dp[i][j],dp[i][j+1]+1);
                }
            }
        }
        int[][] ans = new int[m][n];
        for(int i = 0;i <m;i++){
            for(int j = 0;j < n;j++){
                ans[i][j] = (int)dp[i][j];
            }
        }
        return ans;
    }  
}