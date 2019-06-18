class Solution {
    public int findNthDigit(int n) {
        if(n < 10){
            return n;
        }
        long base = 9;
        int cnt = 1;
        int start = 1;
        while (n > cnt * base) {
            n -= cnt * base;
            ++cnt;
            base *= 10;
            start *= 10;
        }
        start += (n - 1) / cnt;
        String s = Integer.toString(start);
        return s.toCharArray()[(n - 1) % cnt] - '0';
        
    }
}