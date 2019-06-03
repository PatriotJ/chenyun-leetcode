class Solution {
    public int heightChecker(int[] heights) {
        int[] origin = Arrays.copyOf(heights,heights.length);
        Arrays.sort(heights);
        int ans = 0;
        for(int i = 0;i < heights.length;i++){
            if(heights[i] != origin[i]){
                ans ++;
            }
                
        }
        return ans;
            
    }
}