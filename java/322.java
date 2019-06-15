class Solution {
    public int coinChange(int[] coins, int l) {
        // int l = amount.length;
        int[] dp = new int[l+1];
        for(int i = 1; i < l+1;i++){
            dp[i] = l+1;
        }
        for(int i = 1;i <= l;i++){
            for(int coin : coins){
                if(i - coin >= 0){
                    dp[i] = Math.min(dp[i],1+dp[i-coin]);
                }
            }
        }
        return dp[l] == l+1 ?-1:dp[l];
    }
}