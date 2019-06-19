class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        if(m == 0){
            return 0;
        }
        int n = obstacleGrid[0].length;
        if(n == 0){
            return 0;
        }
        int[][] dp = new int[m][n];
        
        for(int i=0;i <m;i++){
            for(int j=0;j<n;j++){
                if(i == 0 && j == 0){
                    dp[0][0] = 1 - obstacleGrid[0][0];
                }else if(i == 0){
                    if(obstacleGrid[i][j] == 1){
                        dp[i][j] = 0;
                    }else{
                        dp[i][j] = dp[i][j-1];
                    }
                }else if(j == 0){
                    if(obstacleGrid[i][j] == 1){
                        dp[i][j] = 0;
                    }else{
                        dp[i][j] = dp[i-1][j];
                    }
                }else{
                    if(obstacleGrid[i][j-1] == 0){
                        dp[i][j] += dp[i][j-1];
                    }
                    if(obstacleGrid[i-1][j] == 0){
                        dp[i][j] += dp[i-1][j];
                    }
                    if(obstacleGrid[i][j] == 1){
                        dp[i][j] = 0;
                    }
                }
            }
        }
        return dp[m-1][n-1];
    }
}