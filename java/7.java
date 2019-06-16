class Solution {
    public int reverse(int x) {
        int z = x < 0 ? -1 : 1;
        // x = Math.abs(x);
        long xx  = Math.abs((long)x);
        long y = 0;
        while(xx != 0){
            y = y * 10 + xx % 10;
            xx = xx / 10;
        }
        if(y > 2147483647){
            return 0;
        }
        return z *(int)y;
        
    }
}