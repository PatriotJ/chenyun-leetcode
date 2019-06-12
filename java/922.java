class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int l = A.length;
        if(l <= 1 ){
            return A;
        }
        int lo = 0;
        int hi = 1;
        while(lo < l && hi < l){
            if(lo % 2 == 1 && A[lo] % 2 == 0){
                if(A[hi] % 2 == 1){
                    int tmp = A[hi];
                    A[hi++] = A[lo];
                    A[lo++] = tmp;
                }else{
                    hi ++;
                }
            }else if(lo % 2 == 0 && A[lo] % 2 == 1){
                if(A[hi] % 2 == 0){
                    int tmp = A[hi];
                    A[hi++] = A[lo];
                    A[lo++] = tmp;
                }else{
                    hi ++;
                }
            }else{
                lo ++;
                if(lo == hi){
                    hi ++;
                }
            }
        }
        return A;
    }
}