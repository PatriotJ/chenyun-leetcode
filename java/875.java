class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        int lo = 1;
        int hi = Integer.MIN_VALUE;
        for(int i = 0;i<piles.length;i++){
            // if(piles[i] < lo){
            //     lo = piles[i];
            // }
            if(piles[i] > hi){
                hi = piles[i];
            }
        }
        while(lo < hi){
            int mid = (lo + hi)/2;
            if(helper(piles,H,mid)){
                hi = mid;
            }else{
                lo = mid + 1;
            }
        }
        return lo;
    }
    
    public boolean helper(int[] piles,int H, int k){
        int ans = 0;
        for(int i : piles){
            if(i % k == 0){
                ans += i/k;
            }else{
                ans += i/k+1;
            }
        }
        return ans <= H;
    }
}