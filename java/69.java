class Solution {
    public int mySqrt(int x) {
        if(x == 1){
            return 1;
        }
        long lo = 1;
        long hi = x;
        while(lo < hi){
            long mid = (lo+hi)/2;
            if(mid * mid == x){
                return (int)mid;
            }else if(mid*mid > x){
                hi = mid;
            }else{
                lo = mid+1;
            }
        }
        return (int)lo-1;
    }
}