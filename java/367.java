class Solution {
    
    public boolean isPerfectSquare(int num) {
        if(num == 1 || num == 4){
            return true;
        }
        long lo = 1;
        long hi = num/2;
        while(lo < hi){
            long mid = (lo + hi)/2;
            // System.out.println(mid);
            if(mid * mid == num){
                return true;
            }
            else if(mid*mid < num){
                lo = mid + 1;
            }else{
                hi = mid;
            }
        }
        return false;
    }
}