class Solution {
    public int hIndex(int[] citations) {
        int l = citations.length;
        if(l == 0){
            return 0;
        }
        int lo = 0, hi = l - 1;
        while(lo < hi){
            int mid = (lo + hi)/2;
            if(citations[mid] == l - mid){
                return citations[mid];
            }else if(citations[mid] < l - mid){
                lo = mid + 1;
            }else{
                hi = mid;
            }
        }
        return Math.min(citations[lo],l-lo);
    }
}