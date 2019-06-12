class Solution {
    public int[] sortArrayByParity(int[] A) {
        int l = A.length;
        if(l == 0 || l == 1){
            return A;
        }
        int lo = 0,hi = 1;
        while(lo < l && hi < l){
            if(A[lo] % 2 == 0){
                lo ++;
                if(lo == hi){
                    hi ++;
                }
            }else{
                if(A[hi] % 2 == 0){
                    int tmp = A[hi];
                    A[hi++] = A[lo];
                    A[lo++] = tmp;
                }else{
                    hi ++;
                }
            }
        }
        return A;
    }
}