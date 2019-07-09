class Solution {
    public int maxProfit(int[] prices, int fee) {
        int l = prices.length;
        if(l < 2){
            return 0;
        }
        int cash = 0;
        int hold = -1*prices[0];
        for(int i = 1;i < l;i++){
            cash = Math.max(cash,hold+prices[i]-fee);
            hold = Math.max(hold,cash-prices[i]);
        }
        return cash;
    }
}