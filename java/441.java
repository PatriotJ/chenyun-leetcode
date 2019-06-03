class Solution {
    public int arrangeCoins(int n) {
        if(n <= 1){
            return n;
        }
        long lo = 1;
        long hi = n;
        while(lo < hi){
            long mid = (hi-lo)/2 + lo;
            long res = mid * (mid+1)/2;
            if(res == n){
                return (int)mid;
            }else if(res > n){
                hi = mid;
            }else{
                lo = mid+1;
            }
        }
        return (int)lo-1;
    }
}