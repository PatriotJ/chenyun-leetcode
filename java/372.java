class Solution {
    int mod = 1337;
    public int superPow(int a, int[] b) {
        a = a % mod;
        int ans = 1;
        for(int i : b){
            ans = pow(ans,10) * pow(a,i) % mod;
        }
        return ans;
    }

    public int pow(int a, int b){
        int ans = 1;
        a = a % mod;
        for(int i =0;i < b;i++){
            ans = (ans * a) % mod;
        }
        return ans;
    }
}