class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int i = 0;
        int ans = 0;
        for(int h :houses){
            while(i < heaters.length-1 && heaters[i+1] - h < h -heaters[i]){
                i += 1;
            }
                ans = Math.max(ans,Math.abs(h-heaters[i]));
            
        }
        return ans;
    }
}