class Solution {
    public int divide(int dividend, int divisor) {
        int pos = 1;
        if(dividend < 0)pos *= -1;
        // System.out.println(pos);
        if(divisor < 0) pos *= -1;
        // System.out.println(pos);
        long t1 = Math.abs((long)dividend);
        long t2 = Math.abs((long)divisor);
        long c = 1;
        while(t2 < t1){
            t2 <<= 1;
            c <<= 1;
        }
        long res = 0;
        while(t1 >= Math.abs((long)divisor)){
            while(t1 >= t2){
                t1 -= t2;
                res += c;
            }
            t2 >>= 1;
            c >>= 1;
        }
        // System.out.println(res);
        if(pos * res > 2147483647){
            return 2147483647;
        }
        return (int) (pos*res);
    }
}