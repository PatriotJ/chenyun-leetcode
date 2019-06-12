class Solution {
    public int maxProfit(int[] prices) {
        int l = prices.length;
        if(l < 2){
            return 0;
        }
        int buy = 0;
        int ans = 0;
        for(int i = 0 ; i < l;i++){
            ans = Math.max(prices[i] - prices[buy],ans);
            if(prices[buy] > prices[i]){
                buy = i;
            }
        }
        return ans;
        
    }
}