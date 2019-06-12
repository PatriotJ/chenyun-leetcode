class Solution {
    public int maxProfit(int[] prices) {
        int l = prices.length;
        if(l < 2){
            return 0;
        }
        int ans = 0;
        for(int i = 1;i < l;i++){
            if(prices[i] > prices[i-1]){
                ans += prices[i] - prices[i-1];
            }
        }
        return ans;
    }
}