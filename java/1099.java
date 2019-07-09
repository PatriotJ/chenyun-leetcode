class Solution {
    public int twoSumLessThanK(int[] A, int K) {
        int ans = -1;
        Arrays.sort(A);
        int lo = 0,hi = A.length-1;
        while(lo < hi){
            int S = A[lo] + A[hi];
            if(S < K){
                ans = Math.max(S,ans);
                lo ++;
            }else{
                hi --;
            }
        }
        return ans;
    }
}