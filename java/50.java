class Solution1 {
    public double myPow(double x, int n) {
        long N = n;
        if( n < 0 ){
			x = 1/x ;
            N = -n;
		}
        return fastPow( x , N );
    }
    
    private double fastPow(double x, long n){
				if( n == 0 ){
					return 1.0;
				}
				double half = fastPow( x , n/2 );
				if ( n % 2 == 0){
					return half*half;
				}
				else {
					return half*half*x;
				}
			}
}
class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if( n < 0 ){
			x = 1/x ;
            N = -N;
		}
        double ans = 1;
        double cur = x;
        while(N > 0){
            if(N % 2 == 1.0){
                ans = ans * cur;
                // System.out.println(ans);
            }
            cur *= cur;
            N /= 2;
            
        }
        return ans;
    }

}