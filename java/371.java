class Solution {
    public int getSum(int a, int b) {
        if(a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }
        int x = 0xFFFFFFFF,y = 0x7FFFFFFF;
        while(b != 0){
            int carry = a & b;
            a ^= b;
            b = carry<<1;
        }
        return a ;
    }
}