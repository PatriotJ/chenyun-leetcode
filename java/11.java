class Solution {
    public int maxArea(int[] height) {
        int l = height.length;
        int lo = 0;
        int hi = l-1;
        int ans = 0;
        while(lo < hi){
            ans = Math.max((hi-lo)*Math.min(height[lo],height[hi]),ans);
            if(height[lo] < height[hi]){
                lo ++;
            }else{
                hi --;
            }
        }
       
        return ans;
    }
}