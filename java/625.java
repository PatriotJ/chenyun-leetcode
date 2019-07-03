class Solution {
    public int smallestFactorization(int a) {
        if(a < 2){
            return a;
        }
        int k = 9;
        long ans = 0,mul = 1;
        while(k > 1 && a > 1){
            if(a % k == 0){
                ans = mul*k + ans;
                mul *= 10;
                a /= k;
                if(ans > 2147483647){
                    return 0;
                }
            }else{
                k --;
            }
        }
        return a < 2 ? (int)ans:0;
        
    }
}