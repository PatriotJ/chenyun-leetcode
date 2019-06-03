class Solution {
    public int search(ArrayReader reader, int target) {
        int lo = 0;
        int hi = 1;
        while(reader.get(hi) != 2147483647){
            // lo = hi;
            hi *= 2;
        }
        
        while(lo < hi){
            int mid = (lo+hi)/2;
            int r = reader.get(mid);
            if(r == target){
                return mid;
            }else if(r < target){
                lo = mid+1;
            }else{
                hi = mid;
            }
        }
        if(reader.get(lo) == target){
            return lo;
        }
        if(reader.get(hi) == target){
            return hi;
        }
        return -1;
    }
}