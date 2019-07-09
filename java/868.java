class Solution {
    public int binaryGap(int N) {
        int left = -1;
        int i = 0,ans = 0;
        while(N > 0){
            int k = N % 2;
            N /= 2;
            if(k == 1){
                if(left == -1){
                    left = i;
                }else{
                    ans = Math.max(i-left,ans);
                    left = i;
                }
            }
            i ++;
        }
        return ans;
    }
}