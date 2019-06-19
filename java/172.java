class Solution {
    public int trailingZeroes(int n) {
        int ans = 0;
        long i = 5;
        while(i <= n ){
            ans += n / i;
            i = i * 5;
        }
        return ans;
    }
}