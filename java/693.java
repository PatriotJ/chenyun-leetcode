class Solution {
    public boolean hasAlternatingBits(int n) {
        if(n == 1){
            return true;
        }
        int prev = 0;
        int cur = n % 2;
        n /= 2;
        while(n > 0){
            prev = cur;
            cur = n % 2;
            if(prev == cur){
                return false;
            }
            n /= 2;
        }
        return true;
    }
}