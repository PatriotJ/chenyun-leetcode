class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int l = intervals.length;
        if(l <= 1){
            return 0;
        }
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[1] == b[1]){
                    return a[0] - b[0];
                }
                return a[1] - b[1];
            }
        });
        int start = intervals[0][0],end = intervals[0][1]; 
        int ans = 1;
        for(int i = 1;i < l;i++){
            if(end <= intervals[i][0]){
                ans ++;
                end = intervals[i][1];
            }
        }
        return l - ans;
    }
}