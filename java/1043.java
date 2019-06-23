class Solution {
    public int maxSumAfterPartitioning(int[] A, int K) {
        int l = A.length;
        int[] dp = new int[l+1];
        for(int i = 0;i < l;i++){
            int m = A[i];
            for(int j = 0; j < K && i-j >= 0 ;j++){
                m = Math.max(m,A[i-j]);
                dp[i+1] =Math.max(dp[i+1],dp[i-j] + m *(j+1) );
            }
        }
        return dp[l];
    }
}