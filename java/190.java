public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        int i = 0;
        while(i < 32){
            int k = n & 1;
            res = res * 2 + k;
            n = n>>1;
            i ++;
        }
        return res;
    }
}