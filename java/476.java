class Solution {
    public int findComplement(int num) {
        int ans = 0;
        int i = 0;
        while(num > 0){
            int k = 1 - (num&1);
            ans += k * (int)Math.pow(2,i++);
            num >>= 1;
        }
        return ans;
    }
}