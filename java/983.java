class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int l =days.length;
        int[] dp = new int[l];
        Arrays.fill(dp,Integer.MAX_VALUE);
        for(int i = 0;i < l;i++){
            int prev = 0;
            if(i != 0){
                prev = dp[i-1];
            }
            dp[i] = Math.min(dp[i],prev+Math.min(costs[0],costs[1]));
            for(int j = i+1;j < l && days[j] < days[i] + 7;j++){
                dp[j] = Math.min(dp[j],prev+costs[1]);
            }
            dp[i] = Math.min(dp[i],prev+costs[2]);
            for(int j = i+1;j < l && days[j] < days[i] + 30;j++){
                dp[j] = Math.min(dp[j],prev+costs[2]);
            }
        }
        return dp[l-1];

    }
}