class Solution {
    public int longestPalindromeSubseq(String s) {
        int l = s.length();
        int[][] dp = new int[l][l];
        for(int i = 0;i < l;i++){
            dp[i][i] = 1;
        }
        for(int j = 1;j < l;j++){
            for(int i = 0;i < l-j;i++){
                if(j == 1){
                    if(s.charAt(i) == s.charAt(j+i)){
                        dp[i][j+i] = 2;
                    }else{
                        dp[i][i+j] = 1;
                    }
                }else{
                   if(s.charAt(i) == s.charAt(j+i)){
                        dp[i][j+i] = dp[i+1][i+j-1] + 2;
                    }else{
                        dp[i][i+j] = Math.max(dp[i][j+i-1],dp[i+1][i+j]);
                    } 
                }
            }
        }
        return dp[0][l-1];
    }
}