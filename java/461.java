class Solution {
    public int hammingDistance(int x, int y) {
        int j = x ^ y;
        int ans = 0;
        while(j != 0){
            ans += (j % 2);
            j /= 2;
        }
        return ans;
    }
}