class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length < 1){
            return intervals;
        }
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return a[0] - b[0];
            }
        });
        List<List<Integer>> list = new ArrayList();
        int start = intervals[0][0],end = intervals[0][1];
        for(int i = 1;i < intervals.length;i++){
            if(end < intervals[i][0]){
                List<Integer>temp = new ArrayList();
                temp.add(start);
                temp.add(end);
                list.add(temp);
                start = intervals[i][0];
                end = intervals[i][1];
            }else{
                end = Math.max(end,intervals[i][1]);
            }
        }
        List<Integer>temp = new ArrayList();
                temp.add(start);
                temp.add(end);
                list.add(temp);
        int[][] ans = new int[list.size()][2];
        for(int i = 0; i < list.size();i++){
            ans[i][0] = list.get(i).get(0);
            ans[i][1] = list.get(i).get(1);
        }
        return ans;
    }
}