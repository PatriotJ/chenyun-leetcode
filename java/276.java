class Solution {
    public int numWays(int n, int k) {
        if(k*n == 0){
            return 0;
        }
        if(k == 1){
            return n > 2 ? 0 : 1;
        }
        else{
            if(n == 1){
                return k;
            }else if(n == 2){
                return k*k;
            }else{
                int[] dp = new int[n];
                dp[0] = k;
                dp[1] = k*k;
                for(int i = 2;i< n;i++){
                    dp[i] = (k-1)*(dp[i-1]+dp[i-2]);
                }
                return dp[n-1];
            }
        }
    }
}