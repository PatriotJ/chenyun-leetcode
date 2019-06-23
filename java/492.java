class Solution {
    public int[] constructRectangle(int area) {
        int i = (int)Math.pow(area,0.5);
        int[] ans = new int[2];
        while(i > 0){
            if(area % i == 0){
                ans[0] = area/i;
                ans[1] = i;
                return ans;
            }
            i--;
        }
        return ans;
    }
}