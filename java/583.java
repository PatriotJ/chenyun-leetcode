class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        if(m == 0)return n;
        if(n == 0)return m;
        int[][] dp = new int[m+1][n+1];
        for(int i =0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(word1.charAt(i) == word2.charAt(j)){
                    dp[i+1][j+1] = 1 + dp[i][j];
                    // System.out.println(dp[i+1][j+1]);
                }else{
                    dp[i+1][j+1] = Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }
        }
        return m+n - dp[m][n] * 2;
    }
}