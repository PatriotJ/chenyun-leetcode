class Solution {
    public int shipWithinDays(int[] weights, int D) {
        int lo = 0,hi = 0;
        for(int i:weights){
            lo = Math.max(lo,i);
            hi += i;
        }
        
        while(lo < hi){
            int mid = (lo+hi)/2;
            if(helper(mid,weights,D)){
                hi = mid;
            }else{
                lo = mid+1;
            }
        }
        return lo;
    }
    
    public boolean helper(int output,int[] weights,int D){
        int cap = output;
        int size = 1;
        for(int i = 0;i < weights.length;i++){
            if(cap - weights[i] >= 0){
                cap -= weights[i];
            }else{
                if(output < weights[i]){
                    return false;
                }else{
                    cap  = output - weights[i];
                    size ++;
                }
                
            }
        }
        return size <= D;
    }
}