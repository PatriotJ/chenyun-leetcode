class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if(intervals.length <= 1){
            return intervals.length;
        }
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] i1,int[] i2){
                return i1[0] - i2[0];
            }
        });
        PriorityQueue<Integer> alloc = new PriorityQueue<Integer>(intervals.length,new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                return a-b;
            }
        });
        alloc.add(intervals[0][1]);
        for(int i = 1;i < intervals.length;i++){
            if(intervals[i][0] >= alloc.peek()){
                alloc.poll();
            }
            alloc.add(intervals[i][1]);
        }
        return alloc.size();
    }
}