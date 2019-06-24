class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]>list = new ArrayList();
        int start = newInterval[0], end = newInterval[1],l = intervals.length;
        int i = 0;
        while(i < l && intervals[i][1] < start){
            list.add(intervals[i]);
            i++;
        }
        while(i < l && intervals[i][0] <= end){
            start = Math.min(start,intervals[i][0]);
            end = Math.max(end,intervals[i][1]);
            i ++;
        }
        int[] interval = new int[]{start,end};
        list.add(interval);
        while(i < l){
            list.add(intervals[i++]);
        }

        int[][] ans = new int[list.size()][2];
        for(i = 0;i < list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}