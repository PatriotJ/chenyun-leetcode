class Solution {
    public int nthUglyNumber(int n) {
        int[] ans = new int[n];
        ans[0] = 1;
        int id2 = 0,id3 = 0,id5 = 0;
        int fac2 = 2, fac3 = 3,fac5 = 5;
        int v = 1;
        while(v < n){
            int min = Math.min(Math.min(fac2,fac3),fac5);
            ans[v++] = min;
            if(min == fac2){
                fac2 = 2 * ans[++id2];
            }
            if(min == fac3){
                fac3 = 3 * ans[++id3];
            }
            if(min == fac5){
                fac5 = 5 * ans[++id5];
            }
        }
        return ans[n-1];
    }
}