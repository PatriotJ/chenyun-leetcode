class Solution {
    public int numDecodings(String s) {
        int l = s.length();
        if(l == 0)return 0;
        int[] dp = new int[l+1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for(int i = 1;i < l;i++){
            char c = s.charAt(i),d = s.charAt(i-1);
            // System.out.println(c + " "+ d);
            if(c > '0'){
                dp[i+1] = dp[i];
                // System.out.println(dp[i+1]);
            }
            if ((d =='2' && c<='6') || (d=='1' && c<='9')) {
                dp[i+1] += dp[i-1];
            }
        }
        return dp[l];
        
    }
}