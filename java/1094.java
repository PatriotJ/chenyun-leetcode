class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        
        // int l = trips.length;
        // int max = trips[l-1][2];
        int[] dp = new int[1001];
        for(int[] trip:trips){
            int num = trip[0], start = trip[1],end = trip[2];
            dp[start] += num;
            dp[end] -= num;
        }
        if(dp[0] > capacity){
            return false;
        }
        for(int i = 1;i < 1001;i++){
            dp[i] = dp[i-1] + dp[i];
            if(dp[i] > capacity){
                return false;
            }
        }
        return true;
    }
}