class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        int[] map = new int[60];
        for(int t:time){
            int k = t % 60;
            count += map[(60-k)%60];
            map[k] ++;
        }
        return count;
    }
}