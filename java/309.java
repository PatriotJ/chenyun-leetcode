class Solution {
    public int maxProfit(int[] prices) {
        int l = prices.length;
        if(l < 2){
            return 0;
        }
        int[] buy = new int[l];
        int[] sell = new int[l];
        buy[0] = -1 * prices[0];
        for(int i = 1;i < l;i++){
            sell[i] = Math.max(sell[i-1],buy[i-1]+prices[i]);
            buy[i] = Math.max(buy[i-1],(i>1?sell[i-2]:0)-prices[i]);
        }
        return sell[l-1];
        
    }
}