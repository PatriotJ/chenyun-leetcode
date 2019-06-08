class Solution {
    public int fixedPoint(int[] A) {
        int ans = A.length;
        // if(ans == 0){
        //     return -1;
        // }
        int lo = 0,hi = ans -1;
        while(lo < hi){
            int mid = (lo+hi)/2;
            if(A[mid] > mid){
                hi = mid-1;
            }else if(A[mid] == mid){
                hi = mid;
            }
            else{
                lo = mid + 1;
            }
        }
        if(A[lo] != lo){
            return -1;
        }
        return lo;
    }
}