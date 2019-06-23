class Solution {
    public int findMinDifference(List<String> timePoints) {
        int ans = 1440;
        int[] unix = new int[timePoints.size()];
        for(int i = 0;i < timePoints.size();i++){
            unix[i] = convert(timePoints.get(i));
        }
        Arrays.sort(unix);
        for(int i = 0;i < unix.length-1;i++){
            ans = Math.min(unix[i+1]-unix[i],ans);
        }
        ans = Math.min(ans,unix[0]+1440-unix[unix.length-1]);
        return ans;
    }
    
    public int convert(String s){
        String[] S = s.split(":");
        int a = Integer.valueOf(S[0]);
        int b = Integer.valueOf(S[1]);
        return a * 60 + b;
    }
}