class Solution {
    public int bitwiseComplement(int N) {
        if(N == 0){
            return 1;
        }
        int ans = 0;
        int i = 0;
        while(N != 0){
            int k = N % 2;
            // System.out.println(k+" "+N);
            if(k == 0){
                ans += Math.pow(2,i);
            }
            i++;
            N /= 2;
        }
        return ans;
    }
}